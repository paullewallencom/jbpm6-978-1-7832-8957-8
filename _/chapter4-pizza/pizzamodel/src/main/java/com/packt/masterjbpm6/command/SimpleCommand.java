package com.packt.masterjbpm6.command;

import org.kie.api.runtime.process.WorkItem;
import org.kie.internal.executor.api.CommandContext;

import com.packt.masterjbpm6.pizza.model.Pizza;

public class SimpleCommand implements org.kie.internal.executor.api.Command {

	public org.kie.internal.executor.api.ExecutionResults execute(
			CommandContext ctx) {
		String param1 = (String) ctx.getData("param1");

		WorkItem workitem = (WorkItem) ctx.getData("workItem");
		String param1_wi = (String) workitem.getParameter("param1");
		if (param1 == null || param1.length() == 0) {
			param1 = param1_wi;
		}
		System.out
				.println(String.format(
						"Command executed on executor with data {param1 = %s}",
						param1));
		// WorkItem workItem = (WorkItem) ctx.getData("workItem");
		// User user = (User) workItem.getParameter("UserIn");
		// user.setName(user.getName() + " after command execution");
		org.kie.internal.executor.api.ExecutionResults executionResults = new org.kie.internal.executor.api.ExecutionResults();
		executionResults.setData("dataOut", SimpleCommand.class.getName()
				+ " terminated");

		return executionResults;
	}
}