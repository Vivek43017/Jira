import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.jira.issue.CustomFieldManager
import com.atlassian.jira.issue.MutableIssue
import com.atlassian.jira.issue.fields.CustomField

 
CustomFieldManager cfm = ComponentAccessor.getCustomFieldManager()

 
CustomField customField = cfm.getCustomFieldObjectByName("Review")

def customFieldValue = issue.getCustomFieldValue(customField)

if (customFieldValue == "Yes") {
    MutableIssue newIssue = issue.clone()
    newIssue.setProject(ComponentAccessor.getProjectManager().getProjectObjByKey("ATL"))
    newIssue.store()
}
