package ru.agorbunov.restaurant;

import ru.agorbunov.restaurant.matcher.ModelMatcher;
import ru.agorbunov.restaurant.model.MenuList;
import ru.agorbunov.restaurant.model.Restaurant;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;

import static ru.agorbunov.restaurant.DishTestData.*;
import static ru.agorbunov.restaurant.OrderTestData.*;
import static ru.agorbunov.restaurant.RestaurantTestData.*;

/**
 * Created by Admin on 21.01.2017.
 */
public class MenuListTestData {

    public static final ModelMatcher<MenuList> MATCHER = new ModelMatcher<>();

    public static final MenuList MENU_LIST_01 = new MenuList(RESTAURANT_01, "Меню на 14.01", LocalDateTime.of(2017,1,14,16,30));
    public static final MenuList MENU_LIST_02 = new MenuList(RESTAURANT_02,"Обед комплексный", LocalDateTime.of(2017,1,14,15,45));
    public static final MenuList MENU_LIST_03 = new MenuList(RESTAURANT_03, "Обед" ,LocalDateTime.of(2017,1,14,15,40));
    public static final MenuList MENU_LIST_04 = new MenuList(RESTAURANT_04,"Обед" , LocalDateTime.of(2017,1,14,15,32));

    public static final MenuList MENU_LIST_CREATED = new MenuList(RESTAURANT_01,"Завтрак" , LocalDateTime.of(2017,1,15,15,0));

    public static final int MENU_LIST_01_ID = 100010;
    public static final int MENU_LIST_02_ID = 100011;
    public static final int MENU_LIST_03_ID = 100012;
    public static final int MENU_LIST_04_ID = 100013;
    public static final int RESTAURANT_01_ID = 100006;
    public static final int RESTAURANT_02_ID = 100007;

    // link to RESTAURANT_02 with initialized List<MenuLis> menuLists
    public static final Restaurant RESTAURANT_02_WITH_DISHES = RESTAURANT_02;

    static {
       RESTAURANT_01.setMenuLists(Collections.singletonList(MENU_LIST_01));
       RESTAURANT_01.setOrders(Arrays.asList(ORDER_01,ORDER_02));
       RESTAURANT_02.setMenuLists(Collections.singletonList(MENU_LIST_02));
       RESTAURANT_02.setOrders(Arrays.asList(ORDER_03,ORDER_04));
       RESTAURANT_03.setMenuLists(Collections.singletonList(MENU_LIST_03));
       RESTAURANT_03.setOrders(Collections.singletonList(ORDER_05));
       RESTAURANT_04.setMenuLists(Collections.singletonList(MENU_LIST_04));
       RESTAURANT_04.setOrders(Collections.singletonList(ORDER_06));
       RESTAURANT_CREATED.setMenuLists(Collections.singletonList(MENU_LIST_01));
       RESTAURANT_CREATED.setOrders(Collections.singletonList(ORDER_01));
       MENU_LIST_01.setDishList(Arrays.asList(DISH_01, DISH_02, DISH_03, DISH_04, DISH_05));
       MENU_LIST_02.setDishList(Arrays.asList(DISH_06, DISH_07, DISH_08, DISH_09));
       MENU_LIST_03.setDishList(Arrays.asList(DISH_10, DISH_11, DISH_12, DISH_13, DISH_14));
       MENU_LIST_04.setDishList(Arrays.asList(DISH_15, DISH_16, DISH_17, DISH_18, DISH_19,DISH_20));
       MENU_LIST_CREATED.setDishList(Arrays.asList(DISH_01, DISH_02));
    }

}
