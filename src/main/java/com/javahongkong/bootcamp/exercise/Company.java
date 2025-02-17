package com.javahongkong.bootcamp.exercise;

import java.util.Objects;

public class Company extends AccountHolder {
	private String companyName;
	private int id;

	public Company(String companyName, int taxId) throws Exception {
		super(taxId);
		this.companyName = companyName;
		this.id = taxId;
		if (companyName == null)
			throw new Exception("companyName can not be null");
	}

	public String getCompanyName() {
		// complete the function
		return this.companyName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Company))
			return false;
		Company company = (Company) o;
		return id == company.getIdNumber() && //
				company.getCompanyName().equals(companyName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(companyName, id);
	}

}
