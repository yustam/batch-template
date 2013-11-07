/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.yustam.batch.let;

import javax.batch.api.Batchlet;

public class MyBatchLet implements Batchlet {

	@Override
	public String process() throws Exception {
		return "ok";
	}

	@Override
	public void stop() throws Exception {
	}
}
