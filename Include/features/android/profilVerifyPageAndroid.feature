Feature: profil Feature android

Scenario: verify feature is exist at profil page
Given home Page apps sehatQ
When user tap icon Profil
Then I verify the feature keluarga is present
And I verify the feature aktivitas is present
And I verify the feature kalender is present
And I verify the feature Health Record is present