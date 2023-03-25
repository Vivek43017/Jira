
var storyPointsField = getFieldById("customfield_10000");
var estimatedCompletionDateField = getFieldById("customfield_10001");

var teamVelocity = 10;

if (storyPointsField.getValue()) {
  var storyPoints = parseInt(storyPointsField.getValue());
  var currentDate = new Date();
  var daysToComplete = Math.ceil(storyPoints / teamVelocity);
  var estimatedCompletionDate = new Date(currentDate.getTime() + daysToComplete * 86400000); // Convert days to milliseconds

  estimatedCompletionDateField.setFormValue(estimatedCompletionDate);
} else {
  estimatedCompletionDateField.setFormValue(null);
}
