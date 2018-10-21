/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CurrentAccountApiServiceImpl implements CurrentAccountApiService {

	public DepositBaseWithIdAndRoot executePostDeposits(String crReferenceId, DepositBase request){
		return JsonReader.read("executePost-DepositBaseWithIdAndRoot.json",new TypeReference<DepositBaseWithIdAndRoot>(){});
	}
	
	public DepositBaseWithIdAndRoot executePutDeposits(String crReferenceId, String bqReferenceId, DepositBase request){
		return JsonReader.read("executePut-DepositBaseWithIdAndRoot.json",new TypeReference<DepositBaseWithIdAndRoot>(){});
	}
	
	public PaymentBaseWithIdAndRoot executePostPayments(String crReferenceId, PaymentBase request){
		return JsonReader.read("executePost-PaymentBaseWithIdAndRoot.json",new TypeReference<PaymentBaseWithIdAndRoot>(){});
	}
	
	public PaymentBaseWithIdAndRoot executePutPayments(String crReferenceId, String bqReferenceId, PaymentBase request){
		return JsonReader.read("executePut-PaymentBaseWithIdAndRoot.json",new TypeReference<PaymentBaseWithIdAndRoot>(){});
	}
	
	public CurrentAccountBaseWithIdAndStatus initiate(CurrentAccountBase request){
		return JsonReader.read("initiate-CurrentAccountBaseWithIdAndStatus.json",new TypeReference<CurrentAccountBaseWithIdAndStatus>(){});
	}
	
	public CurrentAccountRecordResponse record(String crReferenceId, CurrentAccountRecordRequest request){
		return JsonReader.read("record-CurrentAccountRecordResponse.json",new TypeReference<CurrentAccountRecordResponse>(){});
	}
	
	public DirectDebitBaseWithIdAndRoot requestPostDirectDebits(String crReferenceId, DirectDebitBase request){
		return JsonReader.read("requestPost-DirectDebitBaseWithIdAndRoot.json",new TypeReference<DirectDebitBaseWithIdAndRoot>(){});
	}
	
	public DirectDebitBaseWithIdAndRoot requestPutDirectDebits(String crReferenceId, String bqReferenceId, DirectDebitBase request){
		return JsonReader.read("requestPut-DirectDebitBaseWithIdAndRoot.json",new TypeReference<DirectDebitBaseWithIdAndRoot>(){});
	}
	
	public InventoryBaseWithIdAndRoot requestPostInventories(String crReferenceId, InventoryBase request){
		return JsonReader.read("requestPost-InventoryBaseWithIdAndRoot.json",new TypeReference<InventoryBaseWithIdAndRoot>(){});
	}
	
	public InventoryBaseWithIdAndRoot requestPutInventories(String crReferenceId, String bqReferenceId, InventoryBase request){
		return JsonReader.read("requestPut-InventoryBaseWithIdAndRoot.json",new TypeReference<InventoryBaseWithIdAndRoot>(){});
	}
	
	public LienBaseWithIdAndRoot requestPostLiens(String crReferenceId, LienBase request){
		return JsonReader.read("requestPost-LienBaseWithIdAndRoot.json",new TypeReference<LienBaseWithIdAndRoot>(){});
	}
	
	public LienBaseWithIdAndRoot requestPutLiens(String crReferenceId, String bqReferenceId, LienBase request){
		return JsonReader.read("requestPut-LienBaseWithIdAndRoot.json",new TypeReference<LienBaseWithIdAndRoot>(){});
	}
	
	public StandingOrderBaseWithIdAndRoot requestPostStandingOrders(String crReferenceId, StandingOrderBase request){
		return JsonReader.read("requestPost-StandingOrderBaseWithIdAndRoot.json",new TypeReference<StandingOrderBaseWithIdAndRoot>(){});
	}
	
	public StandingOrderBaseWithIdAndRoot requestPutStandingOrders(String crReferenceId, String bqReferenceId, StandingOrderBase request){
		return JsonReader.read("requestPut-StandingOrderBaseWithIdAndRoot.json",new TypeReference<StandingOrderBaseWithIdAndRoot>(){});
	}
	
	public SweepBaseWithIdAndRoot requestPostSweeps(String crReferenceId, SweepBase request){
		return JsonReader.read("requestPost-SweepBaseWithIdAndRoot.json",new TypeReference<SweepBaseWithIdAndRoot>(){});
	}
	
	public SweepBaseWithIdAndRoot requestPutSweeps(String crReferenceId, String bqReferenceId, SweepBase request){
		return JsonReader.read("requestPut-SweepBaseWithIdAndRoot.json",new TypeReference<SweepBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CurrentAccountBaseWithIdAndStatus retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CurrentAccountBaseWithIdAndStatus.json",new TypeReference<CurrentAccountBaseWithIdAndStatus>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public DepositBaseWithIdAndRoot retrieveDeposits(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DepositBaseWithIdAndRoot.json",new TypeReference<DepositBaseWithIdAndRoot>(){});
	}
	
	public DirectDebitBaseWithIdAndRoot retrieveDirectDebits(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DirectDebitBaseWithIdAndRoot.json",new TypeReference<DirectDebitBaseWithIdAndRoot>(){});
	}
	
	public FeeBaseWithIdAndRoot retrieveFees(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-FeeBaseWithIdAndRoot.json",new TypeReference<FeeBaseWithIdAndRoot>(){});
	}
	
	public InterestBaseWithIdAndRoot retrieveInterests(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-InterestBaseWithIdAndRoot.json",new TypeReference<InterestBaseWithIdAndRoot>(){});
	}
	
	public InventoryBaseWithIdAndRoot retrieveInventories(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-InventoryBaseWithIdAndRoot.json",new TypeReference<InventoryBaseWithIdAndRoot>(){});
	}
	
	public LienBaseWithIdAndRoot retrieveLiens(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-LienBaseWithIdAndRoot.json",new TypeReference<LienBaseWithIdAndRoot>(){});
	}
	
	public PaymentBaseWithIdAndRoot retrievePayments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PaymentBaseWithIdAndRoot.json",new TypeReference<PaymentBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public RepostBaseWithIdAndRoot retrieveReports(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RepostBaseWithIdAndRoot.json",new TypeReference<RepostBaseWithIdAndRoot>(){});
	}
	
	public StandingOrderBaseWithIdAndRoot retrieveStandingOrders(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-StandingOrderBaseWithIdAndRoot.json",new TypeReference<StandingOrderBaseWithIdAndRoot>(){});
	}
	
	public StatementBaseWithIdAndRoot retrieveStatements(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-StatementBaseWithIdAndRoot.json",new TypeReference<StatementBaseWithIdAndRoot>(){});
	}
	
	public SweepBaseWithIdAndRoot retrieveSweeps(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-SweepBaseWithIdAndRoot.json",new TypeReference<SweepBaseWithIdAndRoot>(){});
	}
	
	public Void terminate(String crReferenceId){
		return null;
	}
	
	public CurrentAccountBaseWithIdAndStatus update(String crReferenceId, CurrentAccountWithStatus request){
		return JsonReader.read("update-CurrentAccountBaseWithIdAndStatus.json",new TypeReference<CurrentAccountBaseWithIdAndStatus>(){});
	}
	
}
