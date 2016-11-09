package edu.uga.cs.evote.entity.impl;

import edu.uga.cs.evote.EVException;
import edu.uga.cs.evote.entity.Candidate;
import edu.uga.cs.evote.entity.Election;
import edu.uga.cs.evote.entity.PoliticalParty;
import edu.uga.cs.evote.persistence.impl.Persistent;

public class CandidateImpl extends Persistent implements Candidate {

	//attributes
	String choiceID;
	String name;
	int voteCount;
	Election election = null;
	PoliticalParty politicalParty = null;
	String description;
	
	//constructors
	public CandidateImpl()
	{
		super(-1);
		choiceID = null;
		name = null;
		voteCount = -1;
	}
	
	public CandidateImpl(String choiceID, String name, int voteCount, Election election, PoliticalParty politicalParty)
	{
		super(-1);
		this.choiceID = choiceID;
		this.name = name;
		this.voteCount = voteCount;
		this.election = election;
		this.politicalParty = politicalParty;
	}

	@Override
	public String getChoiceID() {
		return choiceID;
	}

	@Override
	public void setChoiceID(String choiceID) {
		this.choiceID = choiceID;
	}
	
	@Override	
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getVoteCount() {
		return voteCount;
	}

	@Override
	public void setVoteCount(int voteCount) throws EVException {
		this.voteCount = voteCount;
	}

	@Override
	public void addVote() {
		voteCount++;
	}

	@Override
	public Election getElection() throws EVException {
		return election;
	}

	@Override
	public void setElection(Election election) throws EVException {
		this.election = election;
	}

	@Override
	public PoliticalParty getPoliticalParty() throws EVException {
		return politicalParty;
	}

	@Override
	public void setPoliticalParty(PoliticalParty politicalParty) throws EVException {
		this.politicalParty = politicalParty;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
