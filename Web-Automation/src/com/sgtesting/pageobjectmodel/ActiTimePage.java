   package com.sgtesting.pageobjectmodel;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class ActiTimePage {

		public ActiTimePage(WebDriver oBrowser)
		{
			PageFactory.initElements(oBrowser, this);
		}

		//WebElement for Login Page UserName text field
		private WebElement username;
		public WebElement getUsername() {
			return username;
		}

	
		

		//WebElement for Login Page Password text field
		private WebElement pwd;
		public WebElement getPwd() {
			return pwd;
		}
	
		

		//WebElement for Login Page Login button field
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement oLogin;
		public WebElement getoLogin() {
			return oLogin;
		}
		
		

		//WebElement for Home Page Flyout Window 
		private WebElement gettingStartedShortcutsPanelId;
		public WebElement getGettingStartedShortcutsPanelId() {
			return gettingStartedShortcutsPanelId;
		}

		

		//WebElement for Home Page Logout link
		@FindBy(linkText="Logout")
		private WebElement oLogout;
		public WebElement getoLogout() {
			return oLogout;
		}
	
		
		
		//WebElement for Create User Button
		@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
        private WebElement createuser;
		public WebElement getCreateuser() {
			return createuser;
		}
		
		
		//WebElement for Add User Button
		@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]")
		private WebElement adduserbutton;
		public WebElement getAdduserbutton() {
			return adduserbutton;
		}

		
		//WebElement for Firstname text field
		private WebElement firstName;
		public WebElement getFirstName() {
			return firstName;
		}
		
		//WebElement for Lastname text field
		private WebElement lastName;
		public WebElement getLastName() {
			return lastName;
		}
		
		//WebElement for email text field
		private WebElement email;
		public WebElement getEmail() {
			return email;
		}
		
		//WebElement for username text field
		private WebElement userDataLightBox_usernameField;
		public WebElement getUserDataLightBox_usernameField() {
			return userDataLightBox_usernameField;
		}
		
		//WebElement for password text field
		private WebElement password;
		public WebElement getPassword() {
			return password;
		}
		
		//WebElement for passwordcopy text field
		private WebElement passwordCopy;
		public WebElement getPasswordCopy() {
			return passwordCopy;
		}
		
		//WebElement for createuser button
		@FindBy(xpath="//span[text()='Create User']")
		private WebElement oCreateuser;
		public WebElement getoCreateuser() {
			return oCreateuser;
		}

		
		//WebElement for deleteuser button
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
		private WebElement odeleteuser;
		public WebElement getOdeleteuser() {
			return odeleteuser;
	     }
		
	
		
		//WebElement for delete button
		@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
		private WebElement odelbutton;
		public WebElement getOdelbutton() {
			return odelbutton;
		}	
		
		//WebElement for ModifyText
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
		private WebElement modifytext;
		public WebElement getmodifytext() {
			return modifytext;
		}
		
		//WebElement for ModifyFirstNameText field
		private WebElement userDataLightBox_firstNameField;
		public WebElement getuserDataLightBox_firstNameField() {
			return userDataLightBox_firstNameField;
		}
		
		//WebElement for savechanges button
		@FindBy(xpath="//span[text()='Save Changes']")
		private WebElement oSavechanges;
		public WebElement getoSavechanges() {
			return oSavechanges;
		}
		
		//WebElement for Taskbutton
		@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr/td[4]/a/div[2]")
		private WebElement oTaskbutton;
		public WebElement getoTaskbutton() {
			return oTaskbutton;
		}

		
		
		//WebElement for AddNewTask button
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div")
		private WebElement oaddnewtask;
		public WebElement getOaddnewtask() {
			return oaddnewtask;
		}
		
		
		//WebElement for createnewtask
		@FindBy(xpath="/html/body/div[13]/div[1]")
		private WebElement ocreatenewtask;
		public WebElement getOcreatenewtask() {
			return ocreatenewtask;
		}
		
		
		
		//WebElement for EnterTaskname
		@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
		private WebElement oEnterTaskname;
		public WebElement getoEnterTaskname() {
			return oEnterTaskname;
		}
		
		
		
		//WebElement for createtask button
		@FindBy(xpath="//span[text()='Create Tasks']")
		private WebElement taskbutton;
		public WebElement getTaskbutton() {
			return taskbutton;
		}
		
		//WebElement for Addnewcustomer button
		@FindBy(xpath="//span[text()='Add New']")
		private WebElement oAddnewcust;
		public WebElement getoAddnewcust() {
			return oAddnewcust;
		}
		
		
		//WebElement for createtask button
		@FindBy(xpath="/html/body/div[14]/div[1]")
		private WebElement ocreatetask;
		public WebElement getOcreatetask() {
			return ocreatetask;
		}

		//WebElement for createcustname textfield
		private WebElement customerLightBox_nameField;
		public WebElement getCustomerLightBox_nameField() {
			return customerLightBox_nameField;
		}
		
		//WebElement for custdescription
		private WebElement customerLightBox_descriptionField;
		public WebElement getCustomerLightBox_descriptionField() {
			return customerLightBox_descriptionField;
		}
		
		
		//WebElement for createcust button
		private WebElement customerLightBox_commitBtn;
		public WebElement getCustomerLightBox_commitBtn() {
			return customerLightBox_commitBtn;
		}
		
        //WebElement for newProject button
		@FindBy(xpath="/html/body/div[14]/div[2]")
		private WebElement onewProjectbutton;
		public WebElement getOnewProjectbutton() {
			return onewProjectbutton;
		}
		
		
		
		//WebElement for projectname textfield
		private WebElement projectPopup_projectNameField;
		public WebElement getProjectPopup_projectNameField() {
			return projectPopup_projectNameField;
		}
		
	    //WebElement for projectdescription textfield
		private WebElement projectPopup_projectDescriptionField;
		public WebElement getProjectPopup_projectDescriptionField() {
			return projectPopup_projectDescriptionField;
		}
		
		
	    //WebElement for createproject button
		@FindBy(xpath="//span[text()='Create Project']")
		private WebElement ocreateprojbutton;
		 public WebElement getOcreateprojbutton() {
				return ocreateprojbutton;
			}
		
		
		//WebElement for projsettingsbutton
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		private WebElement oprojsettingsbutton;
		public WebElement getOprojsettingsbutton() {
			return oprojsettingsbutton;
		}
		
		
		//WebElement for projactionbutton
		@FindBy(xpath="//div[text()='ACTIONS']")
		private WebElement oprojactionbutton;
		public WebElement getOprojactionbutton() {
			return oprojactionbutton;
		}
       
		
		//WebElement for deletebutton
		@FindBy(xpath="//div[text()='Delete']")
		private WebElement odelebutton;
		public WebElement getOdelebutton() {
			return odelebutton;
		}
		
		
		//WebElement for projdelepermanently
		@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitBtn\']/div")
		private WebElement odelepermanently;
		public WebElement getOdelepermanently() {
			return odelepermanently;
		}
		
		
		//WebElement for custsettingsbutton
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement ocustsettingsbutton;
		public WebElement getOcustsettingsbutton() {
			return ocustsettingsbutton;
		}
		
		//WebElement for custactionbutton
		@FindBy(xpath="//div[text()='ACTIONS']")
		private WebElement ocustactionbutton;
		public WebElement getOcustactionbutton() {
			return ocustactionbutton;
		}
		
		
		//WebElement for custdelebutton
		@FindBy(xpath="//div[text()='Delete']")
		private WebElement ocustdelebutton;
		public WebElement getOcustdelebutton() {
			return ocustdelebutton;
		}

		//WebElement for custdelepermanently
		private WebElement customerPanel_deleteConfirm_submitTitle;
		public WebElement getCustomerPanel_deleteConfirm_submitTitle() {
			return customerPanel_deleteConfirm_submitTitle;
		}
}