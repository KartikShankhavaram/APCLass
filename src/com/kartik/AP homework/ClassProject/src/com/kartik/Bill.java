package com.kartik;

public class Bill extends Membership {

    float productCost;
    float serviceCost;
    char memberType; // p -> premium, g -> gold, s -> silver, n -> not a member
    int productDiscount;
    int serviceDiscount;
    boolean wrongMembershipCategory;

    public Bill(float productCost, float serviceCost, char memberType) {

        this.productCost = productCost;
        this.serviceCost = serviceCost;
        this.memberType = memberType;
        wrongMembershipCategory = false;

    }

    private void getDiscountPercent() {

        switch(memberType) {

           // For premium membership
            case 'p': serviceDiscount = premiumDiscountPercent;
                      productDiscount = memberProductDiscount;
                      break;

            // For gold membership
            case 'g': serviceDiscount = goldDiscountPercent;
                      productDiscount = memberProductDiscount;
                      break;

            // For silver membership
            case 's': serviceDiscount = silverDiscountPercent;
                      productDiscount = memberProductDiscount;
                      break;

            // For no membership
            case 'n': serviceDiscount = 0;
                      productDiscount = 0;
                      break;

            // For wrong membership identifier entered
            default:  System.out.println("Wrong membership category, invoice could not be processed.");
                      wrongMembershipCategory = true;
        }

    }

    public float getFinalAmount() {

        float finalAmount;

        getDiscountPercent();
        finalAmount = ((serviceCost * (100 - serviceDiscount)) + (productCost * (100 - productDiscount))) / 100;

        return finalAmount;

    }
}
