package HelperFunctions;

import java.util.ArrayList;



public class HelperFunctions {




    /*

        Proje kapsamında gerekli genel methodlari burada tanımlayacağız, buradaki methodlari birer doğrulayıcı yada
    oluşturucu olarak düşünebiliriz. Örneğin bir city nin varlığını doğrulama veya bir rastgele bir numara oluşturuma.

     */

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "checkCity" diyelim,
            Tipi: static
            Return tipi: String
            Parametre: String türünden bir city almalı

        Eğer ki city:
            Address classinin icerisindeki static arrayliste bulunan bir city e eşit değilse
            bir RuntimeException firlatsin ve şu mesaji geçsin:
                "We can not continue your process because, there is no shipping that location."
        Eğer ki city:
            Arraylistin içerisinde var ise o zaman city i dondursun.

     */
public static String checkCity(String checkcity) {
    ArrayList<String> citylist = Database.Address.getCityList();

    try {
        for (String citys : citylist) {
            if (citys.contains(checkcity)) {

            }
        }


    }catch (RuntimeException ex)
    {
                return "We can not continue your process because, there is no shipping that location.";
    }

    finally
    {
                return checkcity;
    }
}


    // Method buraya yazılacak

    //---------------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "generateShippingTrackingNumber" diyelim,
            Tipi: static
            Return tipi: String
            Parametre: String türünden bir fullname, bir city, bir zipcode almalı

        Bu methodun amacı bir kargo takip numarasi üretmektir.

        kargo takip numarası şu şekilde oluşacak ve daha sonrada return olacaktır.

            city nin ilk 3 harfi + zipcode + fullname in baş harfleri

        son olarak ise dönen değer tamamen büyük harde dönmelidir.

        örneğin bir takip kodu: IZM35430CK (Izmir + 35430 + Cem Karaca)

     */
public static String generateShippingTrackingNumber(String city, String fullname,String zipcode) {

    int soyad = (fullname.indexOf(" ") + 1);
    String trackingnumber=(city.substring(0,3)+zipcode+fullname.charAt(0)+fullname.charAt(soyad));

    return trackingnumber;
}


    // Method buraya yazılacak

    //---------------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "checkZipCode" diyelim,
            Tipi: static
            Return tipi: String
            Parametre: String türünden bir zipCode almalı

        Eğer ki zipCode:
            5 rakamdan oluşmuyorsa RuntimeException firlatmalı ve mesaj olarak ise "Please enter valid Zip Code"
            geçmeli
        diğer durumda ise zipCode unu döndürmeli
     */

    // Method buraya yazılacak
public static String checkZipCode(String zipcode){


    try {
        if (zipcode.length()>=5){

        }

    }catch (RuntimeException ex){
        return "Please enter valid Zip Code";
    }
    finally {
                return zipcode;
    }
}
    //---------------------------------------------------------------------------------------


}
