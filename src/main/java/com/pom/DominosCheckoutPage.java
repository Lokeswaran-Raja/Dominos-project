package com.pom;

import com.base.Base;
import org.openqa.selenium.By;

public class DominosCheckoutPage extends Base {
        public By orderNow = By.xpath("//button[.='ORDER ONLINE NOW']");

        public By notifBtn =By.xpath("(//button[@class=\"ng-binding\"])[1]");

        public By deliveryAddressBtn =By.xpath("//input[@class=\"srch-cnt-srch-inpt\"]");

        public By searchArea =By.xpath("(//input[@type=\"text\"])[1]");

        public By locateMe=By.xpath("(//span[text()='Locate Me'])[1]");

        public By selectLocation=By.xpath("(//span[@class=\"lst-desc-main ellipsis\"])[2]");
        //li[@data-label="location_[object Object]"]
//        (//span[@class="lst-desc-main ellipsis"])[1]

        public By vegSection=By.xpath("(//div[@data-label=\"Veg Pizza\"])[1]");
        //span[.='VEG PIZZA']

        public By margImg=By.xpath("(//img[@class=\"img-wrpr__img\"])[3]");

        public By margAddCart=By.xpath("(//span[.='ADD TO CART'])[1]");

        public By peppyImg=By.xpath("(//img[@class=\"img-wrpr__img\"])[19]");

        public By peppyAddCart=By.xpath("(//span[.='ADD TO CART'])[1]");
//        public By malabarPizza = By.xpath("(//div[@class=\"injectStyles-sc-1jy9bcf-0 eRJwMX\"])[30]");
//        public By pizza1=By.xpath("//span[text()='Margherita']/following::span[text()='ADD TO CART'][1]");
//
////        public By addOn =By.xpath("(//div[@class=\"injectStyles-sc-1jy9bcf-0 jvymXv\"])[1]");
//        public By pizza2=By.xpath("(//button[@data-label=\"addTocart\"])[17]");
//
//        public By pizza3=By.xpath("(//button[@data-label=\"addTocart\"])[19]");

//        public By pizza1=By.xpath("(//button[@data-label=\"addTocart\"])[19]");
//
//        public By pizza2=By.xpath("(//button[@data-label=\"addTocart\"])[21]");
//
//        public By pizza3=By.xpath("(//button[@data-label=\"addTocart\"])[23]");
        public By BeverageSection=By.xpath("//span[.='BEVERAGES']");
        public By pepsi=By.xpath("(//span[.='ADD TO CART'])[52]");

        public By removePdt=By.xpath("(//div[@data-label=\"decrease\"])[7]");

        public By checkOut=By.xpath("//button[@data-label=\"miniCartCheckout\"]");






}
