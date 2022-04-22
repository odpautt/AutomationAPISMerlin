package com.indra.pojoApis;

import java.util.List;

public class CaseForAutomationRequest {
	private List<String> aplication;
	private List<String> appTypeToValidate;
	private List<String> contentFeature;
	private List<String> contentProperties;
	private List<String> process;
	private List<String> nameFeature;
	private String allowsTrace;
	private String browser;
	private boolean stopExecution;
	private List<String> aplicationType;
	private List<Integer> iterations;
	private boolean testError;

	public void setAplication(List<String> aplication){
		this.aplication = aplication;
	}

	public List<String> getAplication(){
		return aplication;
	}

	public void setAppTypeToValidate(List<String> appTypeToValidate){
		this.appTypeToValidate = appTypeToValidate;
	}

	public List<String> getAppTypeToValidate(){
		return appTypeToValidate;
	}

	public void setContentFeature(List<String> contentFeature){
		this.contentFeature = contentFeature;
	}

	public List<String> getContentFeature(){
		return contentFeature;
	}

	public void setContentProperties(List<String> contentProperties){
		this.contentProperties = contentProperties;
	}

	public List<String> getContentProperties(){
		return contentProperties;
	}

	public void setProcess(List<String> process){
		this.process = process;
	}

	public List<String> getProcess(){
		return process;
	}

	public void setNameFeature(List<String> nameFeature){
		this.nameFeature = nameFeature;
	}

	public List<String> getNameFeature(){
		return nameFeature;
	}

	public void setAllowsTrace(String allowsTrace){
		this.allowsTrace = allowsTrace;
	}

	public String getAllowsTrace(){
		return allowsTrace;
	}

	public void setBrowser(String browser){
		this.browser = browser;
	}

	public String getBrowser(){
		return browser;
	}

	public void setStopExecution(boolean stopExecution){
		this.stopExecution = stopExecution;
	}

	public boolean isStopExecution(){
		return stopExecution;
	}

	public void setAplicationType(List<String> aplicationType){
		this.aplicationType = aplicationType;
	}

	public List<String> getAplicationType(){
		return aplicationType;
	}

	public void setIterations(List<Integer> iterations){
		this.iterations = iterations;
	}

	public List<Integer> getIterations(){
		return iterations;
	}

	public void setTestError(boolean testError){
		this.testError = testError;
	}

	public boolean isTestError(){
		return testError;
	}
}