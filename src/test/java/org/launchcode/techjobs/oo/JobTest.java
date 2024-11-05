package org.launchcode.techjobs.oo;

import static org.testng.Assert.assertNotEquals;


import org.junit.Test;

public class JobTest {
    //TODO: Create your unit tests here


        @Test
        public void testSettingJobId() {
            Job job1 = new Job();
            Job job2 = new Job();

            assertNotEquals(job1.getId(), job2.getId(), "Job IDs should be unique");
        }
    }


