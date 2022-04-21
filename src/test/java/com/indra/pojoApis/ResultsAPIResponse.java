package com.indra.pojoApis;

import java.util.List;

public class ResultsAPIResponse{
	private List<String> result;
	private String executionStatus;
	private String urlEvidenceSerenity;
	private String urlEvidenceEvidenceComplete;
	private String urlEvidenceSox;

	public void setResult(List<String> result){
		this.result = result;
	}

	public List<String> getResult(){
		return result;
	}

	public void setExecutionStatus(String executionStatus){
		this.executionStatus = executionStatus;
	}

	public String getExecutionStatus(){
		return executionStatus;
	}

	public void setUrlEvidenceSerenity(String urlEvidenceSerenity){
		this.urlEvidenceSerenity = urlEvidenceSerenity;
	}

	public String getUrlEvidenceSerenity(){
		return urlEvidenceSerenity;
	}

	public void setUrlEvidenceEvidenceComplete(String urlEvidenceEvidenceComplete){
		this.urlEvidenceEvidenceComplete = urlEvidenceEvidenceComplete;
	}

	public String getUrlEvidenceEvidenceComplete(){
		return urlEvidenceEvidenceComplete;
	}

	public void setUrlEvidenceSox(String urlEvidenceSox){
		this.urlEvidenceSox = urlEvidenceSox;
	}

	public String getUrlEvidenceSox(){
		return urlEvidenceSox;
	}
}