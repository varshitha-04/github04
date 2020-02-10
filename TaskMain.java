import java.util.Scanner;
public class TaskMain {
        public static int model;
        public static float price,price1,temp,Totalprice;
        public static void main(String[] args) {
            selectmodel();
            choice();
            discount();
            payment();
        }
        public static int selectmodel() {
            System.out.println("Enter 1 for Hatchback\t 2 for Saloon\t 3 for Estate");
            System.out.println("Enter the model required:");
            Scanner sc = new Scanner(System.in);
            model = sc.nextInt();
            switch (model) {
                case (1):
                    System.out.println("Price of Hatchback Rs 5.35 lakh");
                    price = 535000;
                    break;

                case (2):
                    System.out.println("Price of Saloon Rs 4.95 lakh");
                    price = 495000;
                    break;

                case (3):
                    System.out.println("Price of Estate is Rs 6.25 lakh");
                    price = 625000;
                    break;

                default:
                    System.out.println("Invalid number. Enter the number again");
                    selectmodel();
            }
            temp=price;
            return model;
        }
        public static void choice() {
            int choice, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, extras;
            String extra = "Y";
            while (extra.equalsIgnoreCase("Y")) {
                System.out.println(" optional extras available ");
                System.out.println("------------------------------------");
                System.out.println("1:Set of luxury seats :-Price=45000\n2:Satellite navigation:-Price=5500\n3:Parking sensors:-Price=10000\n4:Bluetooth connectivity:-Price=350\n5:Sound System:-Price=1000");
                System.out.println("------------------------------------");
                System.out.println("Choose the optional extras required ");
                Scanner op = new Scanner(System.in);
                choice = op.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println(" set of luxury seats");
                        System.out.println("price is 45000");
                        price1 = price1 + 45000;
                        break;

                    case 2:
                        System.out.println(" satellite navigation");
                        System.out.println("price is 5500");
                        price1 = price1 + 5500;
                        break;

                    case 3:
                        System.out.println(" parking sensors");
                        System.out.println("price is 1000");
                        price1 = price1 + 10000;
                        break;

                    case 4:
                        System.out.println(" bluetooth connectivity");
                        System.out.println("price is 350");
                        price1 = price1 + 350;
                        break;

                    case 5:
                        System.out.println(" sound system");
                        System.out.println("price is 1000");
                        price1 = price1 + 1000;
                        break;

                    default:
                        System.out.println("You entered a wrong choice");
                }
                System.out.println("Do you want to add other optional extras\nY/N");
                Scanner ex = new Scanner(System.in);
                extra = ex.nextLine();
            }
            Totalprice=price1+price;
            System.out.println("Total price="+Totalprice);
            return;
        }
        public static void discount()
        {
            float discountprice;
            String old="Y";
            System.out.println("Are you an existing customer\n Y/N");
            Scanner scan=new Scanner(System.in);
            old=scan.nextLine();
            if (old.equalsIgnoreCase("Y"))
            {
                System.out.println("Existing customers are offered a discount of 10% off  any optional extras and 10% off the price of the car");
                discountprice=(float)((price1*0.1)+(price*0.1));
                System.out.println("Discount price= "+discountprice);
                Totalprice=Totalprice-discountprice;
                System.out.println("Total after discount= "+Totalprice);
                cartrade();
            }
            else {
                System.out.println("You are offered 5% off on the price of car");
                discountprice=(float)(price*0.05);
                System.out.println("Discount price= "+discountprice);
                Totalprice=Totalprice-discountprice;
                System.out.println("New price after discount= "+Totalprice);
                cartrade();
            }
            return;
        }
        public static void cartrade()
        {
            String trade="Y";
            System.out.println("Do you have an old car to trade\n Y/N");
            Scanner tr=new Scanner(System.in);
            trade=tr.nextLine();
            if(trade.equalsIgnoreCase("Y"))
            {
                Totalprice=Totalprice-10000;
                System.out.println("Price after car trade="+Totalprice);
            }
            return;
        }
        public static void payment()
        {
            float cashback;
            String pay="Y";
            int emi,y;
            System.out.println("Do you wish to make full payment? \n Y/N");
            Scanner scan=new Scanner(System.in);
            pay=scan.nextLine();
            if(pay.equalsIgnoreCase("Y"))
            {
                System.out.println("You will receive 1% cashback on total price");
                cashback=(float)(Totalprice*0.01);
                if (cashback>price1){
                    System.out.println("Best offer is to get a cashback of : "+cashback);
                    System.out.println("The optionals total price is :"+price1);
                    System.out.println("Enter 1 ");
                }
                else{
                    System.out.println("Best offer is to claim for free optional extras of"+price1);
                    System.out.println("The cashback is :"+cashback);
                    System.out.println("Enter 2");
                }
                Scanner x=new Scanner(System.in);
                y=x.nextInt();
                System.out.println("Enter 1 for cashback. " +
                        "2 for free optional extras");
                if(y==1){
                    System.out.println("Cashback claimed is :"+cashback);
                    Totalprice=(Totalprice-cashback);
                    System.out.println("Total amount to be paid :"+Totalprice);
                }
                else{
                    System.out.println("Optional extras fee is: "+price1);
                    System.out.println("Amount to be paid :"+(Totalprice-price1));
                }
                //System.out.println("Caskback= "+cashback);
            }
            else {
                System.out.println("Enter 1 if you wish to make equal payments for 4 years with no extra charges");
                System.out.println("Or enter 2 if you wish to make equal payments for 7 years with 5% increase on the total price");
                emi=scan.nextInt();
                if(emi==1)
                {
                    price=price/48;
                    System.out.println("Equal monthly payments= "+price);
                }
                else {
                    price=price+(float)(price*0.05);
                    price=price/84;
                    System.out.println("Equal monthly payments= "+price);
                }
            }
        }
    }



