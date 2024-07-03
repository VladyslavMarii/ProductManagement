/*
 * Copyright (c) 2024.
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package labs.pm.optional;

import labs.pm.data.*;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author $ {Vladyslav Marii}
 **/
public class InstanceOfExample {
    public void printProduct(Product prod){
        if(prod instanceof Drink drink){
            System.out.println(
                    "Product with name: "+drink.getName()+
                    " is Drink type.");
        }else if(prod instanceof Food food){
            System.out.println(
                    "Product with name: "+food.getName()+
                    " is Food type.");
        }
    }

    public static void main(String[] args) {
        InstanceOfExample example = new InstanceOfExample();
        ProductManager pm = new ProductManager();
        Product p1 = pm.createProduct(
                100, "Kefir", BigDecimal.valueOf(3.99), Rating.FIVE_STAR);
        Product p2 = pm.createProduct(
                101, "English muffin", BigDecimal.valueOf(4.35),
                Rating.FIVE_STAR, LocalDate.now());
        example.printProduct(p1);
        example.printProduct(p2);
        System.out.println(
                "Is product 1 equals to product 2? " + p1.equals(p2));
         p2 = pm.createProduct(
                100, "Kefir", BigDecimal.valueOf(3.99), Rating.FIVE_STAR);
        System.out.println(
                "Is product 1 equals to product 2 after reassigment? " + p1.equals(p2));
    }
}
