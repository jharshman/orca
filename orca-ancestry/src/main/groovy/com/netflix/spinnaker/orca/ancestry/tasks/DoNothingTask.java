package com.netflix.spinnaker.orca.ancestry.tasks;

import com.netflix.spinnaker.orca.ExecutionStatus;
import com.netflix.spinnaker.orca.Task;
import com.netflix.spinnaker.orca.TaskResult;
import com.netflix.spinnaker.orca.pipeline.model.Stage;
import org.springframework.stereotype.Component;

@Component
public class DoNothingTask implements Task {
  @Override
  public TaskResult execute(Stage ignored) {
    return new TaskResult(ExecutionStatus.SUCCEEDED);
  }
}
