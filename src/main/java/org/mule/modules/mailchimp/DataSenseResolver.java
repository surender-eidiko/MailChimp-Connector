/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.mule.api.annotations.MetaDataKeyRetriever;
import org.mule.api.annotations.MetaDataRetriever;
import org.mule.api.annotations.components.MetaDataCategory;
import org.mule.common.metadata.DefaultMetaData;
import org.mule.common.metadata.DefaultMetaDataKey;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataKey;
import org.mule.common.metadata.MetaDataModel;
import org.mule.common.metadata.builder.DefaultMetaDataBuilder;
import org.mule.common.metadata.builder.DynamicObjectBuilder;
import org.mule.common.metadata.datatype.DataType;

// TODO: Auto-generated Javadoc
/**
 * Category which can differentiate between input or output MetaDataRetriever.
 */
@MetaDataCategory
public class DataSenseResolver {

    /**
     * If you have a service that describes the entities, you may want to use
     * that through the connector. Devkit will inject the connector, after
     * initializing it.
     */
    @Inject
    private MailchimpConnector connector;

    /**
     * Retrieves the list of keys.
     *
     * @return the meta data keys
     * @throws Exception the exception
     */
    @MetaDataKeyRetriever
    public List<MetaDataKey> getMetaDataKeys() throws Exception {
        List<MetaDataKey> keys = new ArrayList<MetaDataKey>();

        //Generate the keys
        keys.add(new DefaultMetaDataKey("ENTITY_TYPE_1", "User"));
        keys.add(new DefaultMetaDataKey("ENTITY_TYPE_2", "Book"));

        return keys;
    }

    /**
     * Get MetaData given the Key the user selects.
     *
     * @param key The key selected from the list of valid keys
     * @return The MetaData model of that corresponds to the key
     * @throws Exception If anything fails
     */
    @MetaDataRetriever
    public MetaData getMetaData(MetaDataKey key) throws Exception {
        DefaultMetaDataBuilder builder = new DefaultMetaDataBuilder();
        //If you have a Pojo class
        //PojoMetaDataBuilder<?>  pojoObject=builder.createPojo(Pojo.class);

        //If you use maps as input of your processors that work with DataSense
        DynamicObjectBuilder<?> dynamicObject = builder.createDynamicObject(key
                .getId());

        if (key.getId().equals("ENTITY_TYPE_1")) {
            dynamicObject.addSimpleField("Username", DataType.STRING);
            dynamicObject.addSimpleField("age", DataType.INTEGER);
        } else {
            dynamicObject.addSimpleField("Author", DataType.STRING);
            dynamicObject.addSimpleField("Tittle", DataType.STRING);
        }
        MetaDataModel model = builder.build();
        MetaData metaData = new DefaultMetaData(model);

        return metaData;
    }

    /**
     * Gets the connector.
     *
     * @return the connector
     */
    public MailchimpConnector getConnector() {
        return connector;
    }

    /**
     * Sets the connector.
     *
     * @param connector the new connector
     */
    public void setConnector(MailchimpConnector connector) {
        this.connector = connector;
    }
}