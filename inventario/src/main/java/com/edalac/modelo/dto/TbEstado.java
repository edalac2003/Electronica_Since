>
          <task name="CPL_DefaultPrograms_ProgramsPage_SetAsDefaultClicks" value="5" />
          <task name="CPL_DefaultPrograms_ProgramsPage_ChooseDefaultsClicks" value="6" />
          <task name="CPL_DefaultPrograms_Advanced_SaveClicks" value="7" />
          <task name="CPL_DefaultPrograms_Advanced_3rdPartyInvocations" value="8" />
        </tasks>
        <templates>
          <template tid="SqmCount">
            <data inType="win:GUID" name="SqmSessionGuid" />
            <data inType="win:UInt32" name="SqmID" />
            <data inType="win:UInt32" name="SqmType" />
            <data inType="win:UInt32" name="SqmDWORDDatapointValue" />
          </template>
        </templates>
        <events>
          <event channel="defch" keywords="win:SQM" level="win:Informational" opcode="win:Info" sym