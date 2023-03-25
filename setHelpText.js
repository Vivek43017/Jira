
var issueTypeField = getFieldById("issuetype");
var priorityField = getFieldById("priority");
var environmentField = getFieldById("environment");
var epicLinkField = getFieldById("customfield_10000");


var defaultPriorityValue = "High";
 
if (issueTypeField.getValue() == "Bug") {
 
  priorityField.setFormValue(defaultPriorityValue);
 
  if (!environmentField.getValue()) {
 
    environmentField.setHelpText("Please provide the environment details for this bug");
  }
} else if (issueTypeField.getValue() == "Story") {
  
  if (!epicLinkField.getValue()) {
 
    epicLinkField.setHelpText("Please link this story to an epic");
  }
}
