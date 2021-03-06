package cool.graph.system.database.tables

import slick.lifted.TableQuery

object Tables {
  val Clients                        = TableQuery[ClientTable]
  val Projects                       = TableQuery[ProjectTable]
  val Models                         = TableQuery[ModelTable]
  val Fields                         = TableQuery[FieldTable]
  val Enums                          = TableQuery[EnumTable]
  val FeatureToggles                 = TableQuery[FeatureToggleTable]
  val Functions                      = TableQuery[FunctionTable]
  val ProjectDatabases               = TableQuery[ProjectDatabaseTable]
  val Permissions                    = TableQuery[PermissionTable]
  val ModelPermissions               = TableQuery[ModelPermissionTable]
  val ModelPermissionFields          = TableQuery[ModelPermissionFieldTable]
  val RelationPermissions            = TableQuery[RelationPermissionTable]
  val Relations                      = TableQuery[RelationTable]
  val RelationFieldMirrors           = TableQuery[RelationFieldMirrorTable]
  val RelayIds                       = TableQuery[RelayIdTable]
  val RootTokens                     = TableQuery[RootTokenTable]
  val Actions                        = TableQuery[ActionTable]
  val ActionHandlerWebhooks          = TableQuery[ActionHandlerWebhookTable]
  val ActionTriggerMutationModels    = TableQuery[ActionTriggerMutationModelTable]
  val ActionTriggerMutationRelations = TableQuery[ActionTriggerMutationRelationTable]
  val IntegrationDigits              = TableQuery[IntegrationDigitsTable]
  val IntegrationAuth0s              = TableQuery[IntegrationAuth0Table]
  val SearchProviderAlgolias         = TableQuery[SearchProviderAlgoliaTable]
  val AlgoliaSyncQueries             = TableQuery[AlgoliaSyncQueryTable]
  val Integrations                   = TableQuery[IntegrationTable]
  val MutationLogs                   = TableQuery[MutationLogTable]
  val MutationLogMutactions          = TableQuery[MutationLogMutactionTable]
  val Seats                          = TableQuery[SeatTable]
  val PackageDefinitions             = TableQuery[PackageDefinitionTable]
  val Logs                           = TableQuery[LogTable]
  val FieldConstraints               = TableQuery[FieldConstraintTable]
}
