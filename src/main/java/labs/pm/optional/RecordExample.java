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

import labs.pm.optional.Drink;
import labs.pm.data.Rating;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author $ {Vladyslav Marii}
 **/
public class RecordExample {
    public static void main(String[] args) {
        Drink d1 = new Drink(
                120, "Kefir", BigDecimal.valueOf(3.55), Rating.FIVE_STAR
        );
        Drink d2 = new Drink(
                120, "Kefir", BigDecimal.valueOf(3.55), Rating.FIVE_STAR
        );

        System.out.println("Drink 1: "+d1);
        System.out.println("Drink 2: "+d2);
        System.out.println(
                "Is drink 1 equals to drink 2? " + d1.equals(d2));
        System.out.println(
                "Is drink 1 the same object to drink 2? " + (d1==d2));

        Food f = new Food(
                121, "Bagel", BigDecimal.valueOf(4.87), Rating.FOUR_STAR, LocalDate.now()
        );
        System.out.println(f);
        System.out.println(
                f.name()+" has a disacount of "+ f.discount()+"%"
        );

    }
}
