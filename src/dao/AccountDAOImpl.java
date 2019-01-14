package dao;


import java.sql.ResultSet;

import java.util.ArrayList;

import domain.AccountBean;
import factory.DatabaseFactory;

public class AccountDAOImpl implements AccountDAO {
	
	private static AccountDAOImpl instance = new AccountDAOImpl();
	private AccountDAOImpl(){}
	public static AccountDAOImpl getInstance() {return instance;}

	private ResultSet rs;
	
	@Override
	public void insertAccount(AccountBean account) {
		try {
			String sql = String.format("", "");
			int a = DatabaseFactory.createDatabase("oracle").getConnection().createStatement()
					.executeUpdate(sql);
			if(a==1){
				System.out.println("성공");
			}else{
				System.out.println("실패");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<AccountBean> selectAllAccounts() {
		ArrayList<AccountBean> list = new ArrayList<>();
		try {
			String sql = "select * from member";
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);

			while(rs.next()){
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public AccountBean selectAccountNum(String accountNum) {
		AccountBean account = new AccountBean();
		try {
			String sql = "select * from member";
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);

			while(rs.next()){
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return account;
	}

	@Override
	public int countAccount() {
		int count = 0;
		try {
			String sql = "select * from member";
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);

			while(rs.next()){
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return count;
	}
	
	public boolean existAccount(String accountNum){
		boolean exist = false;
		
		try {
			String sql = "select * from member";
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);

			while(rs.next()){
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exist;
	}
	
	@Override
	public void updateDeposit(String accountNum, String depositMoney) {
		try {
			String sql = String.format("", "");
			int a = DatabaseFactory.createDatabase("oracle").getConnection().createStatement()
					.executeUpdate(sql);
			if(a==1){
				System.out.println("성공");
			}else{
				System.out.println("실패");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateWithdrawal(String accountNum, String withdrawalMoney) {
		try {
			String sql = String.format("", "");
			int a = DatabaseFactory.createDatabase("oracle").getConnection().createStatement()
					.executeUpdate(sql);
			if(a==1){
				System.out.println("성공");
			}else{
				System.out.println("실패");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@Override
	public void deleteAccount(String accountNum) {
		try {
			String sql = String.format("", "");
			int a = DatabaseFactory.createDatabase("oracle").getConnection().createStatement()
					.executeUpdate(sql);
			if(a==1){
				System.out.println("성공");
			}else{
				System.out.println("실패");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
