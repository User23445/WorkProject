package pizza;
/*
 * Цель проекта Pizza: 
 * Написать код для отоброжания акционного предложения для сети пиццерий
 * 
 * Условие:
 * Размер пиццы: маленький, средний;
 * Название пиццы: Пепперони, Домашняя, Классическая, Диабло, 4 сыра, Карбонара, Цыпленок барбекю, Мясная;
 * Тесто: традиционное.
 */
public class Pizza {
	public static void main (String []args) {
		String[] sizeList = {"маленькую", "среднюю", "большую"};
		String[] pizzaList = {"\"Пепперони\"", "\"Домашняя\"", "\"Классическая\"", "\"Диабло\"", "\"4 сыра\"", "\"Карбонара\"", "\"Цыпленок барбекю\"", "\"Мясная\""};
		String[] doughtList = {"на традиционном тесте"};
		
		int oneLength = sizeList.length;
		int twoLength = pizzaList.length;
		int threeLength = doughtList.length;
		
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		String phrase = sizeList[rand1] + " пиццу " + pizzaList[rand2] + " " + doughtList[rand3];
		
		System.out.println("Закажите " + phrase + " и получите скидку 15% при следующем заказе!");
		
		
	}
}
