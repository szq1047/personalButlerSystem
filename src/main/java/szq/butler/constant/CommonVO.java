package szq.butler.constant;

public class CommonVO {
	private String responseCode="000000";
	private String responseMsg="success";
	public CommonVO() {
		
	}
	public CommonVO(String responseCode,String responseMsg) {
		this.responseCode=responseCode;
		this.responseMsg=responseMsg;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMsg() {
		return responseMsg;
	}
	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}
	public CommonVO failed() {
		CommonVO vo=new CommonVO();
		vo.setResponseCode("999999");
		vo.setResponseMsg("ÏµÍ³´íÎó");
		return vo;
	}
	public CommonVO succeed() {
		CommonVO vo=new CommonVO(responseCode,responseMsg);
		return vo;
	}
}
