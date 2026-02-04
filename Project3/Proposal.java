import java.util.Date;
public class Proposal  { 
    private String proposal_code;
    private String proposal_title;
    private String proposal_text;
    private Date proposal_date;
    private StatusProposal Proposal_status ;
    public Proposal(String proposal_code, String proposal_title, String proposal_text, Date proposal_date, StatusProposal proposal_status) {
        this.proposal_code = proposal_code;
        this.proposal_title = proposal_title;
        this.proposal_text = proposal_text;
        this.proposal_date = proposal_date;
        this.Proposal_status = proposal_status;
    }
    
    public void viewProposal(){
        System.out.println("ViewProposal");
    }
    public void viewStatus(){
        System.out.println("ViewStatus"+ Proposal_status);
    }
    public void updateProposal(){
        System.out.println("UpdateProposal");
    }
    public void deleteProposal(){
        System.out.println("DeleteProposal");
    }
    public void archiveProposal(){
        System.out.println("ArchiveProposal");
    }
    public void viewApplicant(){
        System.out.println("ViewApplicant");
    }
}