package com.nt.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Scanner;

import org.hibernate.service.spi.ServiceBinding.ServiceLifecycleOwner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entit.MarriageSeeker;
import com.nt.service.IMarriageSeekerServiceIMGR;
@Component
public class MarriageSeekerRuner implements CommandLineRunner {
	@Autowired
	private IMarriageSeekerServiceIMGR serviceI;

	@Override
	public void run(String... args) throws Exception {
		
		Scanner scn = new Scanner(System.in );
		System.out.println("Enter person name ::");
		String name = scn.next();
		
		System.out.println("Enter person Addrsss::");
		String addrs = scn.next();
		
		System.out.println("Is the Person Indian?:");
		boolean india = scn.nextBoolean();
		
		System.out.println("Enter Person phot fil complet path::");
		String photoPath = scn.next().replace("?","");
		
			//<----------->
	//	prepare byte[] representing photo file content
		InputStream is = new FileInputStream(photoPath);
		byte[] photoData = new byte[is.available()];		
				//				<------------------>
		
		photoData = is.readAllBytes();
		//				<----------->
			
			System.out.println("Enter person biodata file completed path::");
			String biodataPath = scn.next().replace("?",""); scn.nextLine();
		
		//prepare char[] representing biddate file content
		File file =new File(biodataPath);
		FileReader reader = new FileReader(file);
		char[] bioDataContent = new char[(int)file.length()];
		//										<----->
		reader.read(bioDataContent);
		//			<--------------->
		
		
		//prepare Entry class obj 
		/*MarriageSeeker seeker = new MarriageSeeker(name ,addrs,
												photoData,LocalDateTime.of(1990,11,23,12,24),bioDataContent);*/
						MarriageSeeker seeker = new MarriageSeeker(name ,addrs,
								photoData,LocalDateTime.of(1990,11,23,12,24)
								,bioDataContent,india);
					
			
			System.out.println(serviceI.registerMarriageSeeker(seeker));
			
			System.out.println("======================================================");
			
			/*		Optional<MarriageSeeker>opt = serviceI.searchSeekerById(4L);
					
					if(opt.isPresent()) {
						MarriageSeeker seeker1 = opt.get();
						System.out.println(seeker1.getId()+" "+seeker1.getName()+" "+seeker1.getAddrs()+" "+seeker1.isIndian());
						OutputStream os = new FileOutputStream("retrive photo.gfif");
						
						os.write(seeker.getPhoto());
						os.flush();
						Writer writer = new  FileWriter("retrieve_biodata.txt");
						writer.write(seeker.getBiodate());
						writer.flush();
						os.close();
						writer.close();
						System.out.println("LOBs are retrieved");
						
					}
					else {
						System.out.println("Records not found ");
					}
					
				*/
		
		
		
		
		
	}

}
