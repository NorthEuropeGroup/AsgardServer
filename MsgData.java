public class MsgData
{
	private String name;
	private String type;
	private String sender;
	private String receiver;
	public ArrayList<User> userList;
	/*public MsgData()
	{
		this.name = new String();
		this.type = new String();
	}*/
	public MsgData(String name, String sender)
	{
		this.name = name;
		this.type = new String();
		this.sender = sender;
		this.receiver = new String();
		this.userList = new ArrayList<User>();
	}
	public MsgData(String name, String type, String sender)
	{
		this.name = name;
		this.type = type;
		this.sender = sender;
		this.receiver = new String();
		this.userList = new ArrayList<User>();
	}
	public String getName() return name;
	public String getType() return type;
	public String getSender() return sender;
	public String getReceiver() return receiver;
	public void setName(String n) name = n;
	public void setType(String t) type = t;
	public void setSender(String s) sender = s;
	public void setReceiver(String r) receiver = r;
}