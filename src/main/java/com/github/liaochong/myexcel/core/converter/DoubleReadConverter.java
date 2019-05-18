/*
 * Copyright 2019 liaochong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.liaochong.myexcel.core.converter;

import com.github.liaochong.myexcel.utils.StringUtil;

import java.lang.reflect.Field;
import java.math.BigDecimal;

/**
 * Double转换器
 *
 * @author liaochong
 * @version 1.0
 */
public class DoubleReadConverter implements Converter<String, Double> {

    @Override
    public Double convert(String obj, Field field) {
        if (StringUtil.isBlank(obj)) {
            return null;
        }
        String trimContent = obj.trim();
        String realValue = new BigDecimal(trimContent).toPlainString();
        return Double.valueOf(realValue);
    }
}
