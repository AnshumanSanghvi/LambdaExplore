
package com.anshumansanghvi.widget.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.anshumansanghvi.widget.model.Widget;
import com.anshumansanghvi.widget.model.WidgetRequest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GetWidgetHandler {
  
  public Widget handleRequest(WidgetRequest widgetRequest, Context context) {        
    log.info("GetWidgetHandler > handleRequest > Retrieved Context:-");
    logContext(context);
    Widget widget = new Widget(widgetRequest.getId(), "My Widget " + widgetRequest.getId());
    log.info("GetWidgetHandler > handleRequest > New Widget: {}", widget);
    return widget;
  }
  
  private void logContext(Context context) {
    log.info("\nFunction Name: {}, " + 
        "\nMax Mem Allocation: {} MB, " +
        "\nTime Remaining: {} ms, " +
        "\nCloudWatch log Stream Name: {}, " +
        "\nCloudWatch log group Name: {}", 
        context.getFunctionName(), context.getMemoryLimitInMB(), context.getRemainingTimeInMillis(), 
        context.getLogStreamName(), context.getLogGroupName());
  }
  
  
}
