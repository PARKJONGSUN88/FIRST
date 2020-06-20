package com.workshop6.biz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.workshop6.entity.Product;

public class ShoppingBiz implements IShoppingBiz {
    private HashMap<Product, Integer> basket;
        
	public ShoppingBiz() {
		super();
		basket = new HashMap();
		basket.put(new Product("���", 1500), new Integer(6));
		basket.put(new Product("���", 1200), new Integer(3));
		basket.put(new Product("�Ŀ���", 3500), new Integer(1));
		basket.put(new Product("����", 2400), new Integer(5));
	}

	@Override
	public void printAllProducts() {	
		System.out.println("--------------------------------------------");
		System.out.println("����  ǰ���\t �ܰ�   ���԰���");
		System.out.println("--------------------------------------------");
		Set<Product> keys = basket.keySet();
		//index�� ������ �� ���� ��� Iterator��ü�� �޾ƿͼ� ��ҿ� ������ �� �ֽ��ϴ�.
		Iterator<Product> iterator = keys.iterator();
		int no = 0;
		while(iterator.hasNext()){
			System.out.print( ++no+"\t");
		   Product key = (Product)iterator.next();
		   System.out.print(key.getName()+"\t");
		   System.out.print(key.getPrice()+"\t");
		   Integer qty = basket.get(key);
		   System.out.print(qty+"��\n");
		}
		System.out.println("--------------------------------------------");
	}

	@Override
	public void printPricePerProduct() {		 
		Set<Product> keys = basket.keySet();
		//index�� ������ �� ���� ��� Iterator��ü�� �޾ƿͼ� ��ҿ� ������ �� �ֽ��ϴ�.
		Iterator<Product> iterator = keys.iterator();
		int no = 0;
		System.out.println("---------------------");
		while(iterator.hasNext()){
			System.out.print(++no +". ");
		   Product key = (Product)iterator.next();
		   System.out.print(key.getName()+" :");		  
		   Integer qty = basket.get(key);
		   System.out.print(calculateTotalPriceByProduct(key, qty)+"��\n");
		}
		System.out.println("---------------------");
	}
	private int calculateTotalPriceByProduct(Product product, int count) {
		return product.getPrice()*count;
	}

	@Override
	public void calculateTotalPrice() {		
		int total = 0;
		Set<Product> keys = basket.keySet();
		//index�� ������ �� ���� ��� Iterator��ü�� �޾ƿͼ� ��ҿ� ������ �� �ֽ��ϴ�.
		Iterator<Product> iterator = keys.iterator();
		int no = 0;
		while(iterator.hasNext()){		
		   Product key = (Product)iterator.next();		   		  
		   Integer qty = basket.get(key);
		   total+=calculateTotalPriceByProduct(key, qty);		   
		}
		System.out.print("�� ���� ���� : " +total+"��\n");
	}

}
