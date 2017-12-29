package com.netflix.spinnaker.orca.ancestry.pipeline;

import com.netflix.spinnaker.orca.pipeline.StageDefinitionBuilder;
import com.netflix.spinnaker.orca.pipeline.TaskNode;
import com.netflix.spinnaker.orca.pipeline.model.Stage;
import org.springframework.stereotype.Component;

@Component
public class DoNothingStage implements StageDefinitionBuilder {
  @Override
  public void taskGraph(Stage stage, TaskNode.Builder builder) {
    // No operation
  }
}
