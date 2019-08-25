package com.java8.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class DataProviderTest {
	public static void main(String[] args) throws Exception {
		FileReader er=new FileReader("C:\\Users\\Pranav\\Documents\\MyTempProject\\logicinjava8\\Data.csv");
		CSVReader csv=new CSVReaderBuilder(er).withSkipLines(1).build();
		List<CompanyData> al=new ArrayList<>();
		 List<String[]> allData = csv.readAll(); 
		  for (String[] strings : allData) {
			  al.add(new CompanyData(strings[0], Integer.parseInt(strings[1]), Integer.parseInt(strings[2]), 
					  Integer.parseInt(strings[3]), Integer.parseInt(strings[4]), Integer.parseInt(strings[5]), Integer.parseInt(strings[6]), Integer.parseInt(strings[7]),
					  Integer.parseInt(strings[8]), Integer.parseInt(strings[9]), Integer.parseInt(strings[10]), Integer.parseInt(strings[11]), Integer.parseInt(strings[12])));
				
		}
		  Integer Max=getDataBAsedOnMonth(al,f->f.getJan());
		  System.out.println("JAN DATA = "+getCompanyName(al,p->p.getJan()==Max)+"--"+Max);;
		  Integer febMax=getDataBAsedOnMonth(al,f->f.getFeb());
		  System.out.println("FEB DATA = "+getCompanyName(al,p->p.getFeb()==febMax)+"--"+febMax);;
		  Integer MarchMax=getDataBAsedOnMonth(al,f->f.getMarch());
		  System.out.println("MARCH DATA = "+getCompanyName(al,p->p.getMarch()==MarchMax)+"--"+MarchMax);
		  Integer AprilMax=getDataBAsedOnMonth(al,f->f.getApril());
		  System.out.println("April DATA = "+getCompanyName(al,p->p.getApril()==AprilMax)+"--"+AprilMax);
		  Integer MayMax=getDataBAsedOnMonth(al,f->f.getMay());
		  System.out.println("MAY DATA = "+getCompanyName(al,p->p.getMay()==MayMax)+"--"+MayMax);
		  Integer JunMax=getDataBAsedOnMonth(al,f->f.getJune());
		  System.out.println("JUN DATA = "+getCompanyName(al,p->p.getJune()==JunMax)+"--"+JunMax);
		  Integer JulyMax=getDataBAsedOnMonth(al,f->f.getJuly());
		  System.out.println("JULY DATA = "+getCompanyName(al,p->p.getJuly()==JulyMax)+"--"+JulyMax);
		  Integer AugMax=getDataBAsedOnMonth(al,f->f.getAug());
		  System.out.println("AUG DATA = "+getCompanyName(al,p->p.getAug()==AugMax)+"--"+AugMax);
		  Integer SeptMax=getDataBAsedOnMonth(al,f->f.getSept());
		  System.out.println("SEPT DATA = "+getCompanyName(al,p->p.getSept()==SeptMax)+"--"+SeptMax);
		  Integer OctMax=getDataBAsedOnMonth(al,f->f.getOct());
		  System.out.println("OCT DATA = "+getCompanyName(al,p->p.getOct()==OctMax)+"--"+OctMax);
		  Integer NumMax=getDataBAsedOnMonth(al,f->f.getNov());
		  System.out.println("NoV DATA = "+getCompanyName(al,p->p.getNov()==NumMax)+"--"+NumMax);
		  Integer DecMax=getDataBAsedOnMonth(al,f->f.getDec());
		  System.out.println("DEC DATA = "+getCompanyName(al,p->p.getDec()==DecMax)+"--"+DecMax);


		  
		   allData.stream().map(m-> getAverageData(m))
	        .forEach(System.out::println);
	        

	}

	private static String getCompanyName(List<CompanyData> al, Predicate<CompanyData> object) {
		return al.stream().filter(object)
				 .map(m->m.getCompanyName()).collect(Collectors.joining(""));
	}

	private static Integer getDataBAsedOnMonth(List<CompanyData> al, Function<CompanyData, Integer> function) {
		Optional<Integer> max = al.stream().map(function).max((f1,f2)->f1==f2?0:f1<f2?-1:1);
		return max.get();
	}



	private static Object getAverageData(String[] m) {
		Stream<String> stream = Arrays.asList(m).stream();
		 return stream.filter(p->Pattern.matches("[a-zA-Z]*", p))
         		.collect(Collectors.joining(" "))
         		+"="+Arrays.asList(m).stream()
         		.filter(p->!Pattern.matches("[a-zA-Z]*", p))
         		.mapToInt(m1->Integer.parseInt(m1))
         		.summaryStatistics().getAverage();
	}


}


class CompanyData{
	private String companyName;
	private int jan;
	private int feb;
	private int march;
	private int april;
	private int may;
	private int june;
	private int july;
	private int aug;
	private int sept;
	private int oct;
	private int nov;
	private int dec;
	public CompanyData() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public CompanyData(String companyName, int jan, int feb, int march, int april, int may, int june, int july, int aug,
			int sept, int oct, int nov, int dec) {
		super();
		this.companyName = companyName;
		this.jan = jan;
		this.feb = feb;
		this.march = march;
		this.april = april;
		this.may = may;
		this.june = june;
		this.july = july;
		this.aug = aug;
		this.sept = sept;
		this.oct = oct;
		this.nov = nov;
		this.dec = dec;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getJan() {
		return jan;
	}
	public void setJan(int jan) {
		this.jan = jan;
	}
	public int getFeb() {
		return feb;
	}
	public void setFeb(int feb) {
		this.feb = feb;
	}
	public int getMarch() {
		return march;
	}
	public void setMarch(int march) {
		this.march = march;
	}
	public int getApril() {
		return april;
	}
	public void setApril(int april) {
		this.april = april;
	}
	public int getMay() {
		return may;
	}
	public void setMay(int may) {
		this.may = may;
	}
	public int getJune() {
		return june;
	}
	public void setJune(int june) {
		this.june = june;
	}
	public int getJuly() {
		return july;
	}
	public void setJuly(int july) {
		this.july = july;
	}
	public int getAug() {
		return aug;
	}
	public void setAug(int aug) {
		this.aug = aug;
	}
	public int getSept() {
		return sept;
	}
	public void setSept(int sept) {
		this.sept = sept;
	}
	public int getOct() {
		return oct;
	}
	public void setOct(int oct) {
		this.oct = oct;
	}
	public int getNov() {
		return nov;
	}
	public void setNov(int nov) {
		this.nov = nov;
	}
	public int getDec() {
		return dec;
	}
	public void setDec(int dec) {
		this.dec = dec;
	}

	
}
