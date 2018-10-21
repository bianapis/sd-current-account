/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CurrentAccountApiService {

	DepositBaseWithIdAndRoot executePostDeposits(String crReferenceId, DepositBase request);
	
	DepositBaseWithIdAndRoot executePutDeposits(String crReferenceId, String bqReferenceId, DepositBase request);
	
	PaymentBaseWithIdAndRoot executePostPayments(String crReferenceId, PaymentBase request);
	
	PaymentBaseWithIdAndRoot executePutPayments(String crReferenceId, String bqReferenceId, PaymentBase request);
	
	CurrentAccountBaseWithIdAndStatus initiate(CurrentAccountBase request);
	
	CurrentAccountRecordResponse record(String crReferenceId, CurrentAccountRecordRequest request);
	
	DirectDebitBaseWithIdAndRoot requestPostDirectDebits(String crReferenceId, DirectDebitBase request);
	
	DirectDebitBaseWithIdAndRoot requestPutDirectDebits(String crReferenceId, String bqReferenceId, DirectDebitBase request);
	
	InventoryBaseWithIdAndRoot requestPostInventories(String crReferenceId, InventoryBase request);
	
	InventoryBaseWithIdAndRoot requestPutInventories(String crReferenceId, String bqReferenceId, InventoryBase request);
	
	LienBaseWithIdAndRoot requestPostLiens(String crReferenceId, LienBase request);
	
	LienBaseWithIdAndRoot requestPutLiens(String crReferenceId, String bqReferenceId, LienBase request);
	
	StandingOrderBaseWithIdAndRoot requestPostStandingOrders(String crReferenceId, StandingOrderBase request);
	
	StandingOrderBaseWithIdAndRoot requestPutStandingOrders(String crReferenceId, String bqReferenceId, StandingOrderBase request);
	
	SweepBaseWithIdAndRoot requestPostSweeps(String crReferenceId, SweepBase request);
	
	SweepBaseWithIdAndRoot requestPutSweeps(String crReferenceId, String bqReferenceId, SweepBase request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	CurrentAccountBaseWithIdAndStatus retrieve(String crReferenceId);
	
	List<String> retrieveBQs();
	
	DepositBaseWithIdAndRoot retrieveDeposits(String crReferenceId, String bqReferenceId);
	
	DirectDebitBaseWithIdAndRoot retrieveDirectDebits(String crReferenceId, String bqReferenceId);
	
	FeeBaseWithIdAndRoot retrieveFees(String crReferenceId, String bqReferenceId);
	
	InterestBaseWithIdAndRoot retrieveInterests(String crReferenceId, String bqReferenceId);
	
	InventoryBaseWithIdAndRoot retrieveInventories(String crReferenceId, String bqReferenceId);
	
	LienBaseWithIdAndRoot retrieveLiens(String crReferenceId, String bqReferenceId);
	
	PaymentBaseWithIdAndRoot retrievePayments(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	RepostBaseWithIdAndRoot retrieveReports(String crReferenceId, String bqReferenceId);
	
	StandingOrderBaseWithIdAndRoot retrieveStandingOrders(String crReferenceId, String bqReferenceId);
	
	StatementBaseWithIdAndRoot retrieveStatements(String crReferenceId, String bqReferenceId);
	
	SweepBaseWithIdAndRoot retrieveSweeps(String crReferenceId, String bqReferenceId);
	
	Void terminate(String crReferenceId);
	
	CurrentAccountBaseWithIdAndStatus update(String crReferenceId, CurrentAccountWithStatus request);
	
}
