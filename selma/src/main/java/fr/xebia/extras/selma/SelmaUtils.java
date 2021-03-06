/*
 * Copyright 2013  Séven Le Mesle
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package fr.xebia.extras.selma;

/**
 * Created by slemesle on 17/04/2017.
 */
public class SelmaUtils {

    /**
     * Checks if all given objects are null
     * @param vars
     * @return
     */
    public static boolean areNull(Object ... vars){
        boolean res = true;
        for (Object obj : vars) {
            if (obj != null){
                res = false;
                break;
            }
        }
        return res;
    }
}
