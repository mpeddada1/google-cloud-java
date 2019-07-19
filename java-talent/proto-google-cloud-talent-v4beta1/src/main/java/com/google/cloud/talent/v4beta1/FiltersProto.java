// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

public final class FiltersProto {
  private FiltersProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_JobQuery_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_JobQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ProfileQuery_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ProfileQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_LocationFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_LocationFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CompensationFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompensationFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CommuteFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CommuteFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_JobTitleFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_JobTitleFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_SkillFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SkillFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_EmployerFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_EmployerFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_EducationFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_EducationFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_WorkExperienceFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_WorkExperienceFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ApplicationDateFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ApplicationDateFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ApplicationOutcomeNotesFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ApplicationOutcomeNotesFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ApplicationJobFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ApplicationJobFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_TimeFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_TimeFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CandidateAvailabilityFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CandidateAvailabilityFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_PersonNameFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_PersonNameFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/talent/v4beta1/filters.pr"
          + "oto\022\033google.cloud.talent.v4beta1\032\034google"
          + "/api/annotations.proto\032-google/cloud/tal"
          + "ent/v4beta1/application.proto\032(google/cl"
          + "oud/talent/v4beta1/common.proto\032%google/"
          + "cloud/talent/v4beta1/job.proto\032)google/c"
          + "loud/talent/v4beta1/profile.proto\032\036googl"
          + "e/protobuf/duration.proto\032\037google/protob"
          + "uf/timestamp.proto\032\036google/protobuf/wrap"
          + "pers.proto\032\026google/type/date.proto\032\030goog"
          + "le/type/latlng.proto\032\033google/type/timeof"
          + "day.proto\"\343\004\n\010JobQuery\022\r\n\005query\030\001 \001(\t\022\021\n"
          + "\tcompanies\030\002 \003(\t\022E\n\020location_filters\030\003 \003"
          + "(\0132+.google.cloud.talent.v4beta1.Locatio"
          + "nFilter\022@\n\016job_categories\030\004 \003(\0162(.google"
          + ".cloud.talent.v4beta1.JobCategory\022B\n\016com"
          + "mute_filter\030\005 \001(\0132*.google.cloud.talent."
          + "v4beta1.CommuteFilter\022\035\n\025company_display"
          + "_names\030\006 \003(\t\022L\n\023compensation_filter\030\007 \001("
          + "\0132/.google.cloud.talent.v4beta1.Compensa"
          + "tionFilter\022\037\n\027custom_attribute_filter\030\010 "
          + "\001(\t\022\033\n\023disable_spell_check\030\t \001(\010\022E\n\020empl"
          + "oyment_types\030\n \003(\0162+.google.cloud.talent"
          + ".v4beta1.EmploymentType\022\026\n\016language_code"
          + "s\030\013 \003(\t\022G\n\022publish_time_range\030\014 \001(\0132+.go"
          + "ogle.cloud.talent.v4beta1.TimestampRange"
          + "\022\025\n\rexcluded_jobs\030\r \003(\t\"\242\010\n\014ProfileQuery"
          + "\022\r\n\005query\030\001 \001(\t\022E\n\020location_filters\030\002 \003("
          + "\0132+.google.cloud.talent.v4beta1.Location"
          + "Filter\022F\n\021job_title_filters\030\003 \003(\0132+.goog"
          + "le.cloud.talent.v4beta1.JobTitleFilter\022E"
          + "\n\020employer_filters\030\004 \003(\0132+.google.cloud."
          + "talent.v4beta1.EmployerFilter\022G\n\021educati"
          + "on_filters\030\005 \003(\0132,.google.cloud.talent.v"
          + "4beta1.EducationFilter\022?\n\rskill_filters\030"
          + "\006 \003(\0132(.google.cloud.talent.v4beta1.Skil"
          + "lFilter\022Q\n\026work_experience_filter\030\007 \003(\0132"
          + "1.google.cloud.talent.v4beta1.WorkExperi"
          + "enceFilter\022=\n\014time_filters\030\010 \003(\0132\'.googl"
          + "e.cloud.talent.v4beta1.TimeFilter\0222\n\016hir"
          + "able_filter\030\t \001(\0132\032.google.protobuf.Bool"
          + "Value\022T\n\030application_date_filters\030\n \003(\0132"
          + "2.google.cloud.talent.v4beta1.Applicatio"
          + "nDateFilter\022e\n!application_outcome_notes"
          + "_filters\030\013 \003(\0132:.google.cloud.talent.v4b"
          + "eta1.ApplicationOutcomeNotesFilter\022R\n\027ap"
          + "plication_job_filters\030\r \003(\01321.google.clo"
          + "ud.talent.v4beta1.ApplicationJobFilter\022\037"
          + "\n\027custom_attribute_filter\030\017 \001(\t\022_\n\035candi"
          + "date_availability_filter\030\020 \001(\01328.google."
          + "cloud.talent.v4beta1.CandidateAvailabili"
          + "tyFilter\022J\n\023person_name_filters\030\021 \003(\0132-."
          + "google.cloud.talent.v4beta1.PersonNameFi"
          + "lter\"\337\002\n\016LocationFilter\022\017\n\007address\030\001 \001(\t"
          + "\022\023\n\013region_code\030\002 \001(\t\022$\n\007lat_lng\030\003 \001(\0132\023"
          + ".google.type.LatLng\022\031\n\021distance_in_miles"
          + "\030\004 \001(\001\022a\n\026telecommute_preference\030\005 \001(\0162A"
          + ".google.cloud.talent.v4beta1.LocationFil"
          + "ter.TelecommutePreference\022\017\n\007negated\030\006 \001"
          + "(\010\"r\n\025TelecommutePreference\022&\n\"TELECOMMU"
          + "TE_PREFERENCE_UNSPECIFIED\020\000\022\030\n\024TELECOMMU"
          + "TE_EXCLUDED\020\001\022\027\n\023TELECOMMUTE_ALLOWED\020\002\"\300"
          + "\003\n\022CompensationFilter\022H\n\004type\030\001 \001(\0162:.go"
          + "ogle.cloud.talent.v4beta1.CompensationFi"
          + "lter.FilterType\022M\n\005units\030\002 \003(\0162>.google."
          + "cloud.talent.v4beta1.CompensationInfo.Co"
          + "mpensationUnit\022N\n\005range\030\003 \001(\0132?.google.c"
          + "loud.talent.v4beta1.CompensationInfo.Com"
          + "pensationRange\0228\n0include_jobs_with_unsp"
          + "ecified_compensation_range\030\004 \001(\010\"\206\001\n\nFil"
          + "terType\022\033\n\027FILTER_TYPE_UNSPECIFIED\020\000\022\r\n\t"
          + "UNIT_ONLY\020\001\022\023\n\017UNIT_AND_AMOUNT\020\002\022\032\n\026ANNU"
          + "ALIZED_BASE_AMOUNT\020\003\022\033\n\027ANNUALIZED_TOTAL"
          + "_AMOUNT\020\004\"\274\003\n\rCommuteFilter\022B\n\016commute_m"
          + "ethod\030\001 \001(\0162*.google.cloud.talent.v4beta"
          + "1.CommuteMethod\022.\n\021start_coordinates\030\002 \001"
          + "(\0132\023.google.type.LatLng\0222\n\017travel_durati"
          + "on\030\003 \001(\0132\031.google.protobuf.Duration\022!\n\031a"
          + "llow_imprecise_addresses\030\004 \001(\010\022N\n\014road_t"
          + "raffic\030\005 \001(\01626.google.cloud.talent.v4bet"
          + "a1.CommuteFilter.RoadTrafficH\000\0220\n\016depart"
          + "ure_time\030\006 \001(\0132\026.google.type.TimeOfDayH\000"
          + "\"L\n\013RoadTraffic\022\034\n\030ROAD_TRAFFIC_UNSPECIF"
          + "IED\020\000\022\020\n\014TRAFFIC_FREE\020\001\022\r\n\tBUSY_HOUR\020\002B\020"
          + "\n\016traffic_option\"4\n\016JobTitleFilter\022\021\n\tjo"
          + "b_title\030\001 \001(\t\022\017\n\007negated\030\002 \001(\010\"-\n\013SkillF"
          + "ilter\022\r\n\005skill\030\001 \001(\t\022\017\n\007negated\030\002 \001(\010\"\241\002"
          + "\n\016EmployerFilter\022\020\n\010employer\030\001 \001(\t\022L\n\004mo"
          + "de\030\002 \001(\0162>.google.cloud.talent.v4beta1.E"
          + "mployerFilter.EmployerFilterMode\022\017\n\007nega"
          + "ted\030\003 \001(\010\"\235\001\n\022EmployerFilterMode\022$\n EMPL"
          + "OYER_FILTER_MODE_UNSPECIFIED\020\000\022\032\n\026ALL_EM"
          + "PLOYMENT_RECORDS\020\001\022#\n\037CURRENT_EMPLOYMENT"
          + "_RECORDS_ONLY\020\002\022 \n\034PAST_EMPLOYMENT_RECOR"
          + "DS_ONLY\020\003\"\210\001\n\017EducationFilter\022\016\n\006school\030"
          + "\001 \001(\t\022\026\n\016field_of_study\030\002 \001(\t\022<\n\013degree_"
          + "type\030\003 \001(\0162\'.google.cloud.talent.v4beta1"
          + ".DegreeType\022\017\n\007negated\030\006 \001(\010\"|\n\024WorkExpe"
          + "rienceFilter\0221\n\016min_experience\030\001 \001(\0132\031.g"
          + "oogle.protobuf.Duration\0221\n\016max_experienc"
          + "e\030\002 \001(\0132\031.google.protobuf.Duration\"c\n\025Ap"
          + "plicationDateFilter\022%\n\nstart_date\030\001 \001(\0132"
          + "\021.google.type.Date\022#\n\010end_date\030\002 \001(\0132\021.g"
          + "oogle.type.Date\"G\n\035ApplicationOutcomeNot"
          + "esFilter\022\025\n\routcome_notes\030\001 \001(\t\022\017\n\007negat"
          + "ed\030\002 \001(\010\"V\n\024ApplicationJobFilter\022\032\n\022job_"
          + "requisition_id\030\002 \001(\t\022\021\n\tjob_title\030\003 \001(\t\022"
          + "\017\n\007negated\030\004 \001(\010\"\374\001\n\nTimeFilter\022.\n\nstart"
          + "_time\030\001 \001(\0132\032.google.protobuf.Timestamp\022"
          + ",\n\010end_time\030\002 \001(\0132\032.google.protobuf.Time"
          + "stamp\022E\n\ntime_field\030\003 \001(\01621.google.cloud"
          + ".talent.v4beta1.TimeFilter.TimeField\"I\n\t"
          + "TimeField\022\032\n\026TIME_FIELD_UNSPECIFIED\020\000\022\017\n"
          + "\013CREATE_TIME\020\001\022\017\n\013UPDATE_TIME\020\002\".\n\033Candi"
          + "dateAvailabilityFilter\022\017\n\007negated\030\001 \001(\010\""
          + "\'\n\020PersonNameFilter\022\023\n\013person_name\030\001 \001(\t"
          + "Bz\n\037com.google.cloud.talent.v4beta1B\014Fil"
          + "tersProtoP\001ZAgoogle.golang.org/genproto/"
          + "googleapis/cloud/talent/v4beta1;talent\242\002"
          + "\003CTSb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.ApplicationResourceProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.JobResourceProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.ProfileResourceProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.type.DateProto.getDescriptor(),
          com.google.type.LatLngProto.getDescriptor(),
          com.google.type.TimeOfDayProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_talent_v4beta1_JobQuery_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_JobQuery_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_JobQuery_descriptor,
            new java.lang.String[] {
              "Query",
              "Companies",
              "LocationFilters",
              "JobCategories",
              "CommuteFilter",
              "CompanyDisplayNames",
              "CompensationFilter",
              "CustomAttributeFilter",
              "DisableSpellCheck",
              "EmploymentTypes",
              "LanguageCodes",
              "PublishTimeRange",
              "ExcludedJobs",
            });
    internal_static_google_cloud_talent_v4beta1_ProfileQuery_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_ProfileQuery_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ProfileQuery_descriptor,
            new java.lang.String[] {
              "Query",
              "LocationFilters",
              "JobTitleFilters",
              "EmployerFilters",
              "EducationFilters",
              "SkillFilters",
              "WorkExperienceFilter",
              "TimeFilters",
              "HirableFilter",
              "ApplicationDateFilters",
              "ApplicationOutcomeNotesFilters",
              "ApplicationJobFilters",
              "CustomAttributeFilter",
              "CandidateAvailabilityFilter",
              "PersonNameFilters",
            });
    internal_static_google_cloud_talent_v4beta1_LocationFilter_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_LocationFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_LocationFilter_descriptor,
            new java.lang.String[] {
              "Address",
              "RegionCode",
              "LatLng",
              "DistanceInMiles",
              "TelecommutePreference",
              "Negated",
            });
    internal_static_google_cloud_talent_v4beta1_CompensationFilter_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_CompensationFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CompensationFilter_descriptor,
            new java.lang.String[] {
              "Type", "Units", "Range", "IncludeJobsWithUnspecifiedCompensationRange",
            });
    internal_static_google_cloud_talent_v4beta1_CommuteFilter_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4beta1_CommuteFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CommuteFilter_descriptor,
            new java.lang.String[] {
              "CommuteMethod",
              "StartCoordinates",
              "TravelDuration",
              "AllowImpreciseAddresses",
              "RoadTraffic",
              "DepartureTime",
              "TrafficOption",
            });
    internal_static_google_cloud_talent_v4beta1_JobTitleFilter_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4beta1_JobTitleFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_JobTitleFilter_descriptor,
            new java.lang.String[] {
              "JobTitle", "Negated",
            });
    internal_static_google_cloud_talent_v4beta1_SkillFilter_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_talent_v4beta1_SkillFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_SkillFilter_descriptor,
            new java.lang.String[] {
              "Skill", "Negated",
            });
    internal_static_google_cloud_talent_v4beta1_EmployerFilter_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_talent_v4beta1_EmployerFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_EmployerFilter_descriptor,
            new java.lang.String[] {
              "Employer", "Mode", "Negated",
            });
    internal_static_google_cloud_talent_v4beta1_EducationFilter_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_talent_v4beta1_EducationFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_EducationFilter_descriptor,
            new java.lang.String[] {
              "School", "FieldOfStudy", "DegreeType", "Negated",
            });
    internal_static_google_cloud_talent_v4beta1_WorkExperienceFilter_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_talent_v4beta1_WorkExperienceFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_WorkExperienceFilter_descriptor,
            new java.lang.String[] {
              "MinExperience", "MaxExperience",
            });
    internal_static_google_cloud_talent_v4beta1_ApplicationDateFilter_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_talent_v4beta1_ApplicationDateFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ApplicationDateFilter_descriptor,
            new java.lang.String[] {
              "StartDate", "EndDate",
            });
    internal_static_google_cloud_talent_v4beta1_ApplicationOutcomeNotesFilter_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_talent_v4beta1_ApplicationOutcomeNotesFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ApplicationOutcomeNotesFilter_descriptor,
            new java.lang.String[] {
              "OutcomeNotes", "Negated",
            });
    internal_static_google_cloud_talent_v4beta1_ApplicationJobFilter_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_talent_v4beta1_ApplicationJobFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ApplicationJobFilter_descriptor,
            new java.lang.String[] {
              "JobRequisitionId", "JobTitle", "Negated",
            });
    internal_static_google_cloud_talent_v4beta1_TimeFilter_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_talent_v4beta1_TimeFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_TimeFilter_descriptor,
            new java.lang.String[] {
              "StartTime", "EndTime", "TimeField",
            });
    internal_static_google_cloud_talent_v4beta1_CandidateAvailabilityFilter_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_talent_v4beta1_CandidateAvailabilityFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CandidateAvailabilityFilter_descriptor,
            new java.lang.String[] {
              "Negated",
            });
    internal_static_google_cloud_talent_v4beta1_PersonNameFilter_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_talent_v4beta1_PersonNameFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_PersonNameFilter_descriptor,
            new java.lang.String[] {
              "PersonName",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.talent.v4beta1.ApplicationResourceProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
    com.google.cloud.talent.v4beta1.JobResourceProto.getDescriptor();
    com.google.cloud.talent.v4beta1.ProfileResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
    com.google.type.TimeOfDayProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
