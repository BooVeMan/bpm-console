/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2006, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.bpm.console.server.integration;

import org.jboss.bpm.console.client.model.TaskRef;

import java.util.List;
import java.util.Map;

/**
 * @author Heiko.Braun <heiko.braun@jboss.com>
 */
public interface TaskManagement
{
  /**
   * fetch a single task   
   */
  TaskRef getTaskById(long taskId);

  /**
   * assign user to task
   */
  void assignTask(long taskId, String idRef, String userId);

  /**
   * unset a task assignment
   */
  void releaseTask(long taskId, String userId);

  /**
   * complete a task
   */
  void completeTask(long taskId, Map<String, Object> data, String userId);

  /**
   * complete a task with a given outcome (trigger)
   */
  void completeTask(long taskId, String outcome, Map<String, Object> data, String userId);

  /**
   * get tasks assigned to a user
   */
  List<TaskRef> getAssignedTasks(String idRef);

  /**
   * get unassigned tasks where a user participates    
   */
  List<TaskRef> getUnassignedTasks(String idRef, String participationType);
}
