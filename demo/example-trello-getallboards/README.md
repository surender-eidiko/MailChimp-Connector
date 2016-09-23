## MailChimp Anypoint™ Connector


[MailChimp Connector to connect to MailChimp]

## Author
: 
Eidiko Systems Integrators.

## Supported Mule runtime versions
:
Mule 3.7.0

## MailChimp supported versions
:
MailChimp Version 1.0 and above.

## Service or application supported modules
Example: MailChimp 

## Running the Demo

The Demo is used to get all the campaigns in MailChimp. The MailChimp connector gets the campaigns for the user whose authorization token is used to connect to it.

To get the campaigns in connector properties select 'Get campaigns' operation and provide a authorization token in Token field in General.


To run the demo open a browser and type http://localhost:8081/. It will trigger the flow. And you will see the below reply in the browser


{
	"statusCode": "200",
	"statusMessage": null,
	"total_items": "5",
	"_links": [{
		"schema": null,
		"targetSchema": "https://us13.api.mailchimp.com/schema/3.0/Root.json",
		"method": "GET",
		"rel": "parent",
		"href": "https://us13.api.mailchimp.com/3.0/"
	}, {
		"schema": "https://us13.api.mailchimp.com/schema/3.0/CollectionLinks/Campaigns.json",
		"targetSchema": "https://us13.api.mailchimp.com/schema/3.0/Campaigns/Collection.json",
		"method": "GET",
		"rel": "self",
		"href": "https://us13.api.mailchimp.com/3.0/campaigns"
	}, {
		"schema": "https://us13.api.mailchimp.com/schema/3.0/Campaigns/Instance.json",
		"targetSchema": null,
		"method": "POST",
		"rel": "create",
		"href": "https://us13.api.mailchimp.com/3.0/campaigns"
	}],
	"campaigns": [{
		"id": "66394bf637",
		"send_time": "2016-08-05T12:15:54+00:00",
		"delivery_status": {
			"enabled": "false"
		},
		"tracking": {
			"goal_tracking": "false",
			"html_clicks": "true",
			"ecomm360": "false",
			"clicktale": "",
			"opens": "true",
			"google_analytics": "",
			"text_clicks": "true"
		},
		"recipients": {
			"segment_text": "",
			"list_name": "Demo practice",
			"list_id": "ddcaf6395d",
			"recipient_count": "3"
		},
		"status": "sent",
		"settings": {
			"drag_and_drop": "true",
			"timewarp": "false",
			"reply_to": "ravivarma2.eidiko@gmail.com",
			"auto_tweet": "false",
			"use_conversation": "false",
			"inline_css": "false",
			"template_id": "118",
			"fb_comments": "false",
			"subject_line": "Eidiko_Cam",
			"authenticate": "true",
			"folder_id": "",
			"title": "Eidiko_Cam",
			"from_name": "varma",
			"auto_footer": "false",
			"to_name": ""
		},
		"emails_sent": "3",
		"create_time": "2016-08-05T12:14:08+00:00",
		"_links": [{
			"schema": "https://us13.api.mailchimp.com/schema/3.0/CollectionLinks/Campaigns.json",
			"targetSchema": "https://us13.api.mailchimp.com/schema/3.0/Campaigns/Collection.json",
			"method": "GET",
			"rel": "parent",
			"href": "https://us13.api.mailchimp.com/3.0/campaigns"
		}, {
			"schema": null,
			"targetSchema": "https://us13.api.mailchimp.com/schema/3.0/Campaigns/Instance.json",
			"method": "GET",
			"rel": "self",
			"href": "https://us13.api.mailchimp.com/3.0/campaigns/66394bf637"
		}, {
			"schema": null,
			"targetSchema": null,
			"method": "DELETE",
			"rel": "delete",
			"href": "https://us13.api.mailchimp.com/3.0/campaigns/66394bf637"
		}, {
			"schema": null,
			"targetSchema": null,
			"method": "POST",
			"rel": "send",
			"href": "https://us13.api.mailchimp.com/3.0/campaigns/66394bf637/actions/send"
		}, {
			"schema": null,
			"targetSchema": null,
			"method": "POST",
			"rel": "cancel_send",
			"href": "https://us13.api.mailchimp.com/3.0/campaigns/66394bf637/actions/cancel-send"
		}, {
			"schema": null,
			"targetSchema": "https://us13.api.mailchimp.com/schema/3.0/Campaigns/Feedback/Collection.json",
			"method": "GET",
			"rel": "feedback",
			"href": "https://us13.api.mailchimp.com/3.0/campaigns/66394bf637/feedback"
		}, {
			"schema": null,
			"targetSchema": "https://us13.api.mailchimp.com/schema/3.0/Campaigns/Content/Collection.json",
			"method": "GET",
			"rel": "content",
			"href": "https://us13.api.mailchimp.com/3.0/campaigns/66394bf637/content"
		}, {
			"schema": null,
			"targetSchema": "https://us13.api.mailchimp.com/schema/3.0/Campaigns/Checklist/Collection.json",
			"method": "GET",
			"rel": "send_checklist",
			"href": "https://us13.api.mailchimp.com/3.0/campaigns/66394bf637/send-checklist"
		}, {
			"schema": null,
			"targetSchema": null,
			"method": "POST",
			"rel": "pause",
			"href": "https://us13.api.mailchimp.com/3.0/campaigns/66394bf637/actions/pause"
		}, {
			"schema": null,
			"targetSchema": null,
			"method": "POST",
			"rel": "resume",
			"href": "https://us13.api.mailchimp.com/3.0/campaigns/66394bf637/actions/resume"
		}, {
			"schema": null,
			"targetSchema": null,
			"method": "POST",
			"rel": "replicate",
			"href": "https://us13.api.mailchimp.com/3.0/campaigns/66394bf637/actions/replicate"
		}]
	}]
}
