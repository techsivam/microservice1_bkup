/**
 * 
 */
package com.microservice1.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.microservice1.model.ContentMetadata;

/**
 * @author sivpraka
 *
 */
@Service
public class Microservice1Service {

	public ContentMetadata getContentDetails(String id) {
		ContentMetadata cm = new ContentMetadata();
		if (id != null) {
			cm.setAssetId(id);
			cm.setHttpStatus(HttpStatus.OK);
		} else {
			cm.setHttpStatus(HttpStatus.NOT_ACCEPTABLE);
		}
		return cm;
	}
}
