package com.spring.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.model.Customer;

@Repository
public class CustomerRepository implements ICustomerRepositary {

	
	@Autowired
	JdbcTemplate jdbc;
	
	class CustomerRowMapper implements RowMapper<Customer>
	{

		@Override
		public Customer mapRow(ResultSet rs, int row) throws SQLException {
			// TODO Auto-generated method stub
			Customer cost=new Customer();
			cost.setId(rs.getInt("id"));
			cost.setName(rs.getString("name"));
			cost.setEmail(rs.getString("email"));
			cost.setCcemail(rs.getString("ccemail"));
			cost.setPhone(rs.getInt("phone"));
			return cost;
		}
		
	}

	@Override
	public List<Customer> findAll() {
		return jdbc.query("select * from customer", new CustomerRowMapper());
	}

	@Override
	public int  update(Customer cost) {
		return jdbc.update("update customer "+"set name=?,email=?,ccemail=?,phone=?"+"where id=?",
				new Object[] {cost.getName(),cost.getEmail(),cost.getCcemail(),cost.getPhone(),cost.getId()});
	
	}

	@Override
	public Customer findbyId(int id) {
		return jdbc.queryForObject("select * from customer where id=?", new Object[] {id},
				new BeanPropertyRowMapper<Customer>(Customer.class));
	}

	@Override
	public int insert(Customer cost) {
		// TODO Auto-generated method stub
		return jdbc.update("insert into Customer(id,name,email,ccemail,phone)"+"values(?,?,?,?,?)",
				new Object[] {cost.getId(),cost.getName(),cost.getEmail(),cost.getCcemail(),cost.getPhone()});
	}

}
