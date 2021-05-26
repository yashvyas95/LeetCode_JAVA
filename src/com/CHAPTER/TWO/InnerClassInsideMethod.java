package com.CHAPTER.TWO;

public class InnerClassInsideMethod {

    private static final int taxId = 300000; //CLASS STATIC FINAL VARIABLE
    private String name; // INSTANCE VARIABLE

    public String searchBook(final String criteria) {
        int count = 0; // LOCAL VARIABLE
        int sum = 0; // LOCAL VARIABLE
        sum++;
        class Enumerator {
            String iterate(int k) {
                //l1
                /*
                        WHAT CAN BE ACCESSED INSIDE NON STATIC METHOD
                        LOCAL VARIABLE IFF -> EFFECTIVELY FINAL
                 */
                System.out.println(taxId);
                System.out.println(name);
                System.out.println(criteria);
                System.out.println(count);
                System.out.println(k);
                // System.out.println(sum);// CANNOT BE ACCESSED AS SUM IS NOT EFFECTIVELY FINAL
                return "";
            }
        }
        return "";
    }

}
