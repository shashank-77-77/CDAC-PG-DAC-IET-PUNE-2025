package snippet;

public class Snippet {
	log4j:WARN No appenders could be found for logger (org.jboss.logging).
	log4j:WARN Please initialize the log4j system properly.
	log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
	Exception in thread "main" org.hibernate.MappingException: Unknown entity: com.demo.beans.MyUser
		at org.hibernate.metamodel.internal.MetamodelImpl.entityPersister(MetamodelImpl.java:704)
		at org.hibernate.internal.SessionImpl.getEntityPersister(SessionImpl.java:1609)
		at org.hibernate.event.internal.AbstractSaveEventListener.saveWithGeneratedId(AbstractSaveEventListener.java:114)
		at org.hibernate.event.internal.DefaultSaveOrUpdateEventListener.saveWithGeneratedOrRequestedId(DefaultSaveOrUpdateEventListener.java:194)
		at org.hibernate.event.internal.DefaultSaveEventListener.saveWithGeneratedOrRequestedId(DefaultSaveEventListener.java:38)
		at org.hibernate.event.internal.DefaultSaveOrUpdateEventListener.entityIsTransient(DefaultSaveOrUpdateEventListener.java:179)
		at org.hibernate.event.internal.DefaultSaveEventListener.performSaveOrUpdate(DefaultSaveEventListener.java:32)
		at org.hibernate.event.internal.DefaultSaveOrUpdateEventListener.onSaveOrUpdate(DefaultSaveOrUpdateEventListener.java:75)
		at org.hibernate.event.service.internal.EventListenerGroupImpl.fireEventOnEachListener(EventListenerGroupImpl.java:102)
		at org.hibernate.internal.SessionImpl.fireSave(SessionImpl.java:637)
		at org.hibernate.internal.SessionImpl.save(SessionImpl.java:630)
		at org.hibernate.internal.SessionImpl.save(SessionImpl.java:625)
		at com.demo.test.TestMyUser.main(TestMyUser.java:29)
}

