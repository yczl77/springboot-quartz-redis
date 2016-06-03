package timer.service;

import java.io.Serializable;

/**
 * 任务类
 * @author SilenT
 *
 */
public class Task implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 任务名
	 */
	private String job_name;
	
	/**
	 * cron表达式
	 */
	private String cron_expression;
	
	/**
	 * 回调地址
	 */
	private String callback_address;
	
	/**
	 * 回调内容
	 */
	private String callback_content;


	public String getJob_name() {
		return job_name;
	}

	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}


	public String getCron_expression() {
		return cron_expression;
	}

	public void setCron_expression(String cron_expression) {
		this.cron_expression = cron_expression;
	}

	public String getCallback_address() {
		return callback_address;
	}

	public void setCallback_address(String callback_address) {
		this.callback_address = callback_address;
	}
	
	public String getCallback_content() {
		return callback_content;
	}

	public void setCallback_content(String callback_content) {
		this.callback_content = callback_content;
	}

	public Task() {
	}

	public Task(String job_name,String cron_expression, String callback_address) {
		this.job_name = job_name;
		this.cron_expression = cron_expression;
		this.callback_address = callback_address;
	}

}
