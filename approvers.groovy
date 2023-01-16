import com.atlassian.jira.component.ComponentAccessor

def userManager = ComponentAccessor.getUserManager()
def group = userManager.getGroup("approvers")


def issue = issue

def user = ComponentAccessor.getJiraAuthenticationContext().loggedInUser

def transition = issue.getTransitions().find { it.name == "Approve" }

issue.setAssignee(group)


issue.transition(transition, "Approving the issue.", user)
