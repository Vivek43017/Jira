import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.jira.user.ApplicationUser

def groupManager = ComponentAccessor.getGroupManager()
def user = ComponentAccessor.getJiraAuthenticationContext().getLoggedInUser()
def groupName = “jiratest-group"
groupManager.addUserToGroup(user, groupName)
