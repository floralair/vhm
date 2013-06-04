package com.vmware.vhadoop.api.vhm.events;

/* If the ClusterStateChangeListenerImpl notices a delta change, it generates one of these events for the VHM to consume */
public interface ClusterStateChangeEvent extends NotificationEvent {

   public enum VmType {
      MASTER, COMPUTE, OTHER;
   }
   
   public class VMConstantData {
      public VmType _vmType;
      public String _myUUID;
      
      public boolean isComplete() {
         return ((_vmType != null) && (_myUUID != null));
      }
      
      @Override
      public String toString() {
         return "VMConstantData{type="+_vmType.name()+", UUID="+_myUUID+"}";
      }
   }

   public class VMVariableData {
      public String _myName;
      public Integer _vCPUs;
      public String _ipAddr;
      public String _dnsName;
      public Boolean _powerState;
      public String _hostMoRef;

      @Override
      public String toString() {
         return "VMVariableData{name="+_myName+", vCPUs="+_vCPUs+", ipAddr="+_ipAddr+", dnsName="+_dnsName+", powerState="+_powerState+", hostMoRef="+_hostMoRef+"}";
      }
   }

   public class SerengetiClusterConstantData {
      public String _masterMoRef;
      public String _serengetiFolder;

      public boolean isComplete() {
         return ((_masterMoRef != null) && (_serengetiFolder != null));
      }

      @Override
      public String toString() {
         return "SerengetiClusterConstantData{masterMoRef="+_masterMoRef+", folder="+_serengetiFolder+"}";
      }
   }

   public class SerengetiClusterVariableData {
      public Boolean _enableAutomation;
      public Integer _minInstances;
      public Integer _jobTrackerPort;

      public boolean isComplete() {
         return ((_enableAutomation != null) && (_minInstances != null) && (_jobTrackerPort != null));
      }

      @Override
      public String toString() {
         return "SerengetiClusterVariableData{auto="+_enableAutomation+", minInstances="+_minInstances+", jobTrackerPort="+_jobTrackerPort+"}";
      }
   }

}
