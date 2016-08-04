package com.hybrid.mapper;
import java.util.Date;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.hybrid.MosaicWebApplication;
import com.hybrid.domain.Emp;
public class EmpMapperTest {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =  SpringApplication.run(MosaicWebApplication.class, args);
		EmpMapper mapper = ctx.getBean(EmpMapper.class);
		mapper.insert(new Emp(7966, "BILLY", "CLERK", 7839, new Date("1990/04/20"), 1400.00, 550.00, 30));
		Emp e = mapper.selectByEmpno(7966);
		System.out.println("Insert--> " + e);
		List<Emp> Emps= mapper.selectAll();
		Emps.forEach(Emp -> {
			System.out.println(Emp);
		});
		mapper.update(new Emp(7966, "BILLY", "CLERK", 7839, new Date("1990/04/20"), 1880.00, 900.00, 30));
		e = mapper.selectByEmpno(7966);
		System.out.println("Update --> " + e);
		Emps= mapper.selectAll();
		Emps.forEach(Emp -> {
			System.out.println(Emp);
		});
		e = mapper.selectByEmpno(7966);
		System.out.println("Delete " + e);
		mapper.delete(7966);
		Emps= mapper.selectAll();
		Emps.forEach(Emp -> {
			System.out.println(Emp);
		});
		ctx.close();
	}
}
