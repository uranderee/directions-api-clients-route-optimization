//
// Response.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class Response: JSONEncodable {

    public enum Status: String { 
        case Waiting_in_queue = "waiting_in_queue"
        case Processing = "processing"
        case Finished = "finished"
    }
    
    /** unique identify of job - which you get when posting your request to the large problem solver */
    public var job_id: String?
    /** indicates the current status of the job */
    public var status: Status?
    /** waiting time in ms */
    public var waiting_in_queue: Int?
    /** processing time in ms. if job is still waiting in queue, processing_time is 0 */
    public var processing_time: Int?
    /** the solution. only available if status field indicates finished */
    public var solution: Solution?
    

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["job_id"] = self.job_id
        nillableDictionary["status"] = self.status?.rawValue
        nillableDictionary["waiting_in_queue"] = self.waiting_in_queue
        nillableDictionary["processing_time"] = self.processing_time
        nillableDictionary["solution"] = self.solution?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}