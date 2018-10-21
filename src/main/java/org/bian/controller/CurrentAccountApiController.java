/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class CurrentAccountApiController {

	@Autowired
	CurrentAccountApiService service;
	
	@BQ("deposits")
	@Fulfill.ExecutePost
	public BianResponse<DepositBaseWithIdAndRoot> executePostDeposits(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DepositBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostDeposits(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("deposits")
	@Fulfill.ExecutePut
	public BianResponse<DepositBaseWithIdAndRoot> executePutDeposits(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<DepositBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutDeposits(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("payments")
	@Fulfill.ExecutePost
	public BianResponse<PaymentBaseWithIdAndRoot> executePostPayments(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PaymentBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostPayments(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("payments")
	@Fulfill.ExecutePut
	public BianResponse<PaymentBaseWithIdAndRoot> executePutPayments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<PaymentBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutPayments(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<CurrentAccountBaseWithIdAndStatus> initiate(@RequestBody BianRequest<CurrentAccountBase> bianRequest) {
		return BianResponse.forSuccess(service.initiate(bianRequest.getData()));
	}
	
	@Fulfill.Record
	public BianResponse<CurrentAccountRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CurrentAccountRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("direct-debits")
	@Fulfill.RequestPost
	public BianResponse<DirectDebitBaseWithIdAndRoot> requestPostDirectDebits(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DirectDebitBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostDirectDebits(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("direct-debits")
	@Fulfill.RequestPut
	public BianResponse<DirectDebitBaseWithIdAndRoot> requestPutDirectDebits(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<DirectDebitBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutDirectDebits(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventories")
	@Fulfill.RequestPost
	public BianResponse<InventoryBaseWithIdAndRoot> requestPostInventories(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<InventoryBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostInventories(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventories")
	@Fulfill.RequestPut
	public BianResponse<InventoryBaseWithIdAndRoot> requestPutInventories(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<InventoryBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutInventories(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("liens")
	@Fulfill.RequestPost
	public BianResponse<LienBaseWithIdAndRoot> requestPostLiens(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<LienBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostLiens(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("liens")
	@Fulfill.RequestPut
	public BianResponse<LienBaseWithIdAndRoot> requestPutLiens(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<LienBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutLiens(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("standing-orders")
	@Fulfill.RequestPost
	public BianResponse<StandingOrderBaseWithIdAndRoot> requestPostStandingOrders(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<StandingOrderBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostStandingOrders(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("standing-orders")
	@Fulfill.RequestPut
	public BianResponse<StandingOrderBaseWithIdAndRoot> requestPutStandingOrders(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<StandingOrderBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutStandingOrders(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("sweeps")
	@Fulfill.RequestPost
	public BianResponse<SweepBaseWithIdAndRoot> requestPostSweeps(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<SweepBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostSweeps(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("sweeps")
	@Fulfill.RequestPut
	public BianResponse<SweepBaseWithIdAndRoot> requestPutSweeps(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<SweepBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutSweeps(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.Retrieve
	public BianResponse<CurrentAccountBaseWithIdAndStatus> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("deposits")
	@Fulfill.Retrieve
	public BianResponse<DepositBaseWithIdAndRoot> retrieveDeposits(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDeposits(crReferenceId, bqReferenceId));
	}
	
	@BQ("direct-debits")
	@Fulfill.Retrieve
	public BianResponse<DirectDebitBaseWithIdAndRoot> retrieveDirectDebits(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDirectDebits(crReferenceId, bqReferenceId));
	}
	
	@BQ("fees")
	@Fulfill.Retrieve
	public BianResponse<FeeBaseWithIdAndRoot> retrieveFees(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFees(crReferenceId, bqReferenceId));
	}
	
	@BQ("interests")
	@Fulfill.Retrieve
	public BianResponse<InterestBaseWithIdAndRoot> retrieveInterests(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInterests(crReferenceId, bqReferenceId));
	}
	
	@BQ("inventories")
	@Fulfill.Retrieve
	public BianResponse<InventoryBaseWithIdAndRoot> retrieveInventories(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInventories(crReferenceId, bqReferenceId));
	}
	
	@BQ("liens")
	@Fulfill.Retrieve
	public BianResponse<LienBaseWithIdAndRoot> retrieveLiens(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveLiens(crReferenceId, bqReferenceId));
	}
	
	@BQ("payments")
	@Fulfill.Retrieve
	public BianResponse<PaymentBaseWithIdAndRoot> retrievePayments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePayments(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("reports")
	@Fulfill.Retrieve
	public BianResponse<RepostBaseWithIdAndRoot> retrieveReports(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReports(crReferenceId, bqReferenceId));
	}
	
	@BQ("standing-orders")
	@Fulfill.Retrieve
	public BianResponse<StandingOrderBaseWithIdAndRoot> retrieveStandingOrders(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveStandingOrders(crReferenceId, bqReferenceId));
	}
	
	@BQ("statements")
	@Fulfill.Retrieve
	public BianResponse<StatementBaseWithIdAndRoot> retrieveStatements(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveStatements(crReferenceId, bqReferenceId));
	}
	
	@BQ("sweeps")
	@Fulfill.Retrieve
	public BianResponse<SweepBaseWithIdAndRoot> retrieveSweeps(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSweeps(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.Terminate
	public BianResponse<Void> terminate(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.terminate(crReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<CurrentAccountBaseWithIdAndStatus> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CurrentAccountWithStatus> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
