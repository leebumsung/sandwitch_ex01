package com.greedy.section03.exercise01;

public class MenuDTO {
	
	private String sandwitch;
	private String bread;
	private String ingredient;
	private String vegetable;
	private String source;
	
	public MenuDTO() {}

	public MenuDTO(String sandwitch, String bread, String ingredient, String vegetable, String source) {
		super();
		this.sandwitch = sandwitch;
		this.bread = bread;
		this.ingredient = ingredient;
		this.vegetable = vegetable;
		this.source = source;
	}

	public String getSandwitch() {
		return sandwitch;
	}

	public void setSandwitch(String sandwitch) {
		this.sandwitch = sandwitch;
	}

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	public String getVegetable() {
		return vegetable;
	}

	public void setVegetable(String vegetable) {
		this.vegetable = vegetable;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}


	public String getInformation() {
		return "MenuDTO [sandwitch=" + sandwitch + 
				", bread=" + bread + 
				", ingredient=" + ingredient + 
				", vegetable=" + vegetable +
				", source=" + source +
				"]";
	}
}
