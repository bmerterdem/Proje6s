package Database;

public class Items {
    public static double ItemName(String itemname) {
        double donecek=0.0;

        if (itemname.equalsIgnoreCase("Rose teddy bear") || itemname.equalsIgnoreCase("mug")) {
            donecek = 30.0;
        }
        if (itemname.equalsIgnoreCase("Iphone max")) {
            donecek = 850.23;
        }
        if (itemname.equalsIgnoreCase("laptop mouse")) {
            donecek = 23.50;
        }
        if (itemname.equalsIgnoreCase("Monitor")) {
            donecek = 90.23;
        }
        if (itemname.equalsIgnoreCase("charger")) {
            donecek = 43.20;
        }
        if (itemname.equalsIgnoreCase("hdmi cable")) {
            donecek = 5.90;
        }


        return donecek;
    }
    /*

        Item class ını bir veritabanı olarak düşünebiliriz fakat burada bir static method kullanmak yerine satın alınmak
    istenen ürüne göre işlem yapacağız. Örneğin satın alınmak istenen ürün bir telefon ise bize o telefon için bir ücret
    döndürecek ve bu ücreti user in bakiyesine ekliyeceğiz.

     */

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "ItemName" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir itemName almalı

        Eğer ki itemName:
            "Rose teddy bear" ise 30,
            "Iphone max" ise 850.23,
            "laptop mouse" ise 23.50,
            "Monitor" ise 90.23,
            "charger" ise 43.20,
            "hdmi cable" ise 5.90,
            "mug" ise 30
        değerlerini döndürmeli

     */

    // Method buraya yazılacak

    //---------------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "colorPrice" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir color almalı

        Eğer ki color:
            "Red" ise 10,
            "Blue" ise 6,
            "Black" ise 4,
            "White" ise 2
        değerlerini döndürmeli

     */

    // Method buraya yazılacak
    public static double colorPrice(String colorprice) {
        double color = 0.0;
        if (colorprice.equalsIgnoreCase("red"))
            color = 10.0;
        if (colorprice.equalsIgnoreCase("blue"))
            color = 6.0;
        if (colorprice.equalsIgnoreCase("black"))
            color = 4.0;
        if (colorprice.equalsIgnoreCase("white"))
            color = 2.0;

return color;
}
    //---------------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "customText" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir text almalı

        Eğer ki text:
            10 karakterden uzun ise 5,
            10 karakterden kısa veya eşit ise 3
        değerlerini döndürmeli

     */

    // Method buraya yazılacak
public static double customText(String customtext){
    if (customtext.length()>10)
    {
        return 5.0;
    }
    else return 3.0;
}
    //---------------------------------------------------------------------------------------



}



