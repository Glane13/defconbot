package defconbot;
import java.util.ArrayList;
import java.util.Iterator;

public class InitialiseDataV3 {

    //public static void main(String[] args) {
    public ArrayList Population() {

        Session s1 = new Session("Min(Spark) Zheng & Xiangyu Liu", "Room 1", "10:00", "macOS/iOS Kernel Debugging and Heap Feng Shui");
        Session s2 = new Session("The Dark Tangent", "Room 1", "10:00", "Welcome to DEF CON 25");
        Session s3 = new Session("Garry Kasparov", "Track Three", "10:00", "The Brain’s Last Stand");
        Session s4 = new Session("Peyton ‘Foofus’ Engel", "Track Four", "10:00", "Secret Tools: Learning About Government Surveillance Software You Can’t Ever See");
        Session s5 = new Session("Patrick Wardle", "101 Track", "10:30", "Offensive Malware Analysis: Dissecting OSX/FruitFly via a Custom C&C Server");
        Session s6 = new Session("Mikhail Sosonkin", "Track Two", "10:30", "Hacking travel routers like it’s 1999");
        Session s7 = new Session("Garry Kasparov", "Track Three", "10:30","The Brain’s Last Stand cont.");
        Session s8 = new Session("Andrea Matwyshyn & Terrell McSweeny & Dr. Suzanne Schwartz & Leonard Bailey", "Track Four", "10:30","Panel: Meet The Feds");
        Session s9 = new Session("Suggy (AKA Chris Sumner)", "101 Track", "11:00"," Rage Against the Weaponized AI Propaganda Machine");
        Session s10 = new Session("Damien ‘virtualabs’ Cauquil", "Track Two", "11:00","Weaponizing the BBC Micro:Bit");
        Session s11 = new Session("Konstantinos Karagiannis", "Track Three", "11:00", "Hacking Smart Contracts");
        Session s12 = new Session("Andrea Matwyshyn &  Terrell McSweeny &  Dr. Suzanne Schwartz &  & Leonard Bailey", "Track Four", "11:00","Panel: Meet The Feds cont.");
        Session s13 = new Session("Sarah Zatko", "101 Track", "12:00", "CITL and the Digital Standard - A Year Later");
        Session s14 = new Session("Nathan Seidle", "Track Two", "12:00", "Open Source Safe Cracking Robots - Combinations Under 1 Hour! Is it bait? Damn straight it is.");
        Session s15 = new Session("Orange Tsai", "Track Three", "12:00", "A New Era of SSRF - Exploiting URL Parser in Trending Programming Languages!");
        Session s16 = new Session("Mr. Sean Kanuck", "Track Four", "12:00", "Hacking Democracy: A Socratic Dialogue");
        Session s17 = new Session("Caleb Madrigal","101 Track", "13:00", "Controlling IoT Devices With Crafted Radio Signals");
        Session s18 = new Session("Josh Pitts", "Track Two", "13:00", "Teaching Old Shellcode New Tricks");
        Session s19 = new Session("Scott Behrens & Jeremy Heffner", "Track Three", "13:00", "Starting the Avalanche: Application DoS In Microservice Architectures");
        Session s20 = new Session("Roger Dingledine", "Track Four", "13:00", "Next-Generation Tor Onion Services");
        Session s21 = new Session("David ‘Karit’ Robinson", "101 Track", "14:00","Using GPS Spoofing to Control Time");
        Session s22 = new Session("Patrick Wardle", "Track Two", "14:00", "Death By 1000 Installers; on MacOS &  It’s All Broken!");
        Session s23 = new Session("Christopher Domas", "Track Three", "14:00", "Breaking the x86 Instruction Set");
        Session s24 = new Session("Elie Bursztein", "Track Four", "14:00", "How We Created the First SHA-1 Collision and What it means For Hash Security");
        Session s25 = new Session("XlogicX", "101 Track", "15:00","Assembly Language is Too High Level");
        Session s26 = new Session("'Snide’ Owen", "Track Two", "15:00", "Phone System Testing and Other Fun Tricks");
        Session s27 = new Session("Svea Eckert & Andreas Dewes", "Track Three", "15:00", "Dark Data");
        Session s28 = new Session("Hanno Boeck", "Track Four", "15:00", "Abusing Certificate Transparency Logs");
        Session s29 = new Session("Matt Knight & Marc Newlin", "101 Track", "16:00", "Radio Exploitation 101: Characterizing & Contextualizing and Applying Wireless Attack Methods");
        Session s30 = new Session("Itzik Kotler & Amit Klein", "Track Two", "16:00", "The Adventures of AV and the Leaky Sandbox");
        Session s31 = new Session("Andy Robbins & Will Schroeder", "Track Three", "16:00", "An ACE Up the Sleeve: Designing Active Directory DACL Backdoors");
        Session s32 = new Session("Whitney Merrill & Terrell McSweeny", "Track Four", "16:00", "Tick Tick Tick Boom! You’re Dead — Tech & the FTC");
        Session s33 = new Session("Artem Kondratenko", "101 Track", "17:00", "Cisco Catalyst Exploitation");
        Session s34 = new Session("DEF CON Groups", "Track Two", "17:00", "Panel");
        Session s35 = new Session("FuzzyNop (Josh Schwartz) & ceyx (John Cramb)", "Track Three", "17:00", "MEATPISTOL A Modular Malware Implant Framework");
        Session s36 = new Session("Cooper Quintin & Kashmir Hill", "Track Four", "17:00", "The Internet Already Knows I’m Pregnant");



        ArrayList<Object> defConSessions = new ArrayList<>();

        try {

            defConSessions.add(s1);
            defConSessions.add(s2);
            defConSessions.add(s3);
            defConSessions.add(s4);
            defConSessions.add(s5);
            defConSessions.add(s6);
            defConSessions.add(s7);
            defConSessions.add(s8);
            defConSessions.add(s9);
            defConSessions.add(s10);
            defConSessions.add(s11);
            defConSessions.add(s12);
            defConSessions.add(s13);
            defConSessions.add(s14);
            defConSessions.add(s15);
            defConSessions.add(s16);
            defConSessions.add(s17);
            defConSessions.add(s18);
            defConSessions.add(s19);
            defConSessions.add(s20);
            defConSessions.add(s21);
            defConSessions.add(s22);
            defConSessions.add(s23);
            defConSessions.add(s24);
            defConSessions.add(s25);
            defConSessions.add(s26);
            defConSessions.add(s27);
            defConSessions.add(s28);
            defConSessions.add(s29);
            defConSessions.add(s30);
            defConSessions.add(s31);
            defConSessions.add(s32);
            defConSessions.add(s33);
            defConSessions.add(s34);
            defConSessions.add(s35);
            defConSessions.add(s36);

        } catch (Exception e) {

            System.out.println(e);
        }

        return defConSessions;
    }

    public Session completeSession (Session partialSession) {
        Session returnSession = new Session();
        String speaker = partialSession.getSpeaker();
        String location = partialSession.getLocation();
        String time = partialSession.getTime();
        String title = partialSession.getTitle();
        returnSession = partialSession;

        return returnSession;
    }
}